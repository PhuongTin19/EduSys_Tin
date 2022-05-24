CREATE DATABASE EduSys
GO
USE EduSys
GO
CREATE TABLE NhanVien
(
	MaNV NVARCHAR(50) NOT NULL,
	MatKhau NVARCHAR(50) NOT NULL,
	HoTen NVARCHAR(50) NOT NULL,
	VaiTro BIT NOT NULL DEFAULT 0,
	PRIMARY KEY(MaNV)
)


GO
CREATE TABLE ChuyenDe
(
	MaCD NCHAR(5) NOT NULL ,
	TenCD NVARCHAR(50) NOT NULL,
	HocPhi FLOAT NOT NULL DEFAULT 0,
	ThoiLuong INT NOT NULL DEFAULT 0,
	Hinh VARCHAR(50) NOT NULL,
	MoTa NVARCHAR(255) NOT NULL,
	PRIMARY KEY(MaCD)
)

GO
CREATE TABLE KhoaHoc
(
	MaKH INT IDENTITY(1,1) NOT NULL,
	MACD NCHAR(5) NOT NULL,
	HocPhi FLOAT NOT NULL DEFAULT 0,
	ThoiLuong INT NOT NULL DEFAULT 0,
	NgayKG Date NOT NULL,
	GhiChu NVARCHAR(50) NULL,
	MaNV NVARCHAR(50) NOT NULL,
	NgayTao Date NOT NULL DEFAULT getdate(),
	PRIMARY KEY(MaKH),
	check(HocPhi>=0 AND ThoiLuong>0),	
	foreign key(MaCD) references CHUYENDE(MaCD)  ON UPDATE CASCADE, 
	foreign key(MaNV) references NHANVIEN(MaNV)	 ON UPDATE CASCADE
)
select * from ChuyenDe
GO
create TABLE NguoiHoc
(
	MaNH NCHAR(7) NOT NULL,
	HoTen NVARCHAR(50) NOT NULL,
	NgaySinh Date NOT NULL DEFAULT getdate(),
	GioiTinh bit NOT NULL DEFAULT 1,
	DienThoai NVARCHAR(50) NOT NULL,
	Email NVARCHAR(50) NOT NULL,
	GhiChu NVARCHAR(MAX) NULL,
	MaNV NVARCHAR(50) NOT NULL,
	NgayDK Date NOT NULL DEFAULT getdate(),
	Hinh VARCHAR(50) NOT NULL
	PRIMARY KEY(MaNH),
	foreign key(MaNV) REFERENCES NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
)

GO
CREATE TABLE HocVien
(
	MaHV INT IDENTITY(1,1) NOT NULL,
	MaKH INT NOT NULL ,
	MaNH NCHAR(7) NOT NULL ,
	Diem FLOAT NOT NULL DEFAULT -1,
	PRIMARY KEY(MaHV),
	foreign key(MaNH) references NguoiHoc(MaNH)  ON DELETE NO ACTION ON UPDATE CASCADE,
	foreign key(MaKH) references KhoaHoc(MaKH)  
)

--Thêm dữ liệu vào bảng nhân viên
insert into NhanVien(MaNV,MatKhau,HoTen,VaiTro)
values('tinnp','123',N'Nguyễn Phương Tín',1);
insert into NhanVien(MaNV,MatKhau,HoTen,VaiTro)
values('nghiemn','123',N'Nguyễn Nghiệm',0)
insert into NhanVien(MaNV,MatKhau,HoTen,VaiTro)
values('phongtd','123',N'Trần Duy Phong',1)
--Thêm dữ liệu vào bảng chuyên đề

INSERT into ChuyenDe VALUES (N'JAV01', N'Lập trình Java cơ bản', 250, 90, N'GAME.png', N'JAV01 - Lập trình Java cơ bản'), 
(N'JAV02', N'Lập trình Java nâng cao', 300, 90, N'HTCS.jpg', N'JAV02 - Lập trình Java nâng cao'),
 (N'JAV03', N'Lập trình mạng với Java', 200, 70, N'INMA.jpg', N'JAV03 - Lập trình mạng với Java'),
 (N'JAV04', N'Lập trình desktop với Swing', 200, 70, N'ADAV.jpg', N'JAV04 - Lập trình desktop với Swing'),
 (N'PRO01', N'Dự án với công nghệ MS.NET MVC', 300, 90, N'MOWE.png', N'PRO01 - Dự án với công nghệ MS.NET MVC'),
 (N'PRO02', N'Dự án với công nghệ Spring MVC', 300, 90, N'Subject.png', N'PRO02 - Dự án với công nghệ Spring MVC'),
 (N'PRO03', N'Dự án với công nghệ Servlet/JSP', 300, 90, N'GAME.png', N'PRO03 - Dự án với công nghệ Servlet/JSP'),
 (N'PRO04', N'Dự án với AngularJS & WebAPI', 300, 90, N'HTCS.jpg', N'PRO04 - Dự án với AngularJS & WebAPI'),
 (N'PRO05', N'Dự án với Swing & JDBC', 300, 90, N'INMA.jpg', N'PRO05 - Dự án với Swing & JDBC'),
 (N'PRO06', N'Dự án với WindowForm', 300, 90, N'LAYO.jpg', N'PRO06 - Dự án với WindowForm'),
 (N'RDB01', N'Cơ sở dữ liệu SQL Server', 100, 50, N'MOWE.png', N'RDB01 - Cơ sở dữ liệu SQL Server'),
 (N'RDB02', N'Lập trình JDBC', 150, 60, N'Subject.png', N'RDB02 - Lập trình JDBC'),
 (N'RDB03', N'Lập trình cơ sở dữ liệu Hibernate', 250, 80, N'GAME.png', N'RDB03 - Lập trình cơ sở dữ liệu Hibernate'),
 (N'SER01', N'Lập trình web với Servlet/JSP', 350, 100, N'HTCS.jpg', N'SER01 - Lập trình web với Servlet/JSP'),
 (N'SER02', N'Lập trình Spring MVC', 400, 110, N'INMA.jpg', N'SER02 - Lập trình Spring MVC'),
 (N'SER03', N'Lập trình MS.NET MVC', 400, 110, N'LAYO.jpg', N'SER03 - Lập trình MS.NET MVC'),
 (N'SER04', N'Xây dựng Web API với Spring MVC & ASP.NET MVC', 200, 70, N'MOWE.png', N'SER04 - Xây dựng Web API với Spring MVC & ASP.NET MVC'),
 (N'WEB01', N'Thiết kế web với HTML và CSS', 200, 70, N'Subject.png', N'WEB01 - Thiết kế web với HTML và CSS'),
(N'WEB02', N'Thiết kế web với Bootstrap', 0, 40, N'GAME.png', N'WEB02 - Thiết kế web với Bootstrap'),
 (N'WEB03', N'Lập trình front-end với JavaScript và jQuery', 150, 60, N'HTCS.jpg', N'WEB03 - Lập trình front-end với JavaScript và jQuery'),
 (N'WEB04', N'Lập trình AngularJS', 250, 80, N'INMA.jpg', N'WEB04 - Lập trình AngularJS')
--Thêm dữ liệu vào bảng khóa học
INSERT into khoaHoc VALUES (N'PRO02', 300, 90, CAST(0xBF3D0B00 AS Date), N'', N'tinnp', CAST(0xB53D0B00 AS Date)),
 (N'JAV04', 300, 90, CAST(0xDF3D0B00 AS Date), N'',  N'tinnp', CAST(0xB53D0B00 AS Date)),
 (N'JAV04', 100, 50, CAST(0xFC3D0B00 AS Date), N'',  N'tinnp', CAST(0xB53D0B00 AS Date)),
(N'JAV04', 250, 80, CAST(0x103E0B00 AS Date), N'',  N'tinnp', CAST(0xB53D0B00 AS Date)),
(N'PRO04', 300, 90, CAST(0xD3400B00 AS Date), N'', N'tinnp', CAST(0xE6400B00 AS Date)),
 (N'JAV01', 300, 90, CAST(0xF6400B00 AS Date), N'Lập trình Java cơ bản',  N'tinnp', CAST(0x0A410B00 AS Date)),
 (N'JAV02', 300, 90, CAST(0xF6400B00 AS Date), N'Lập trình Java nâng cao',  N'tinnp', CAST(0x0A410B00 AS Date)),
 (N'JAV03', 200, 70, CAST(0xF6400B00 AS Date), N'Lập trình mạng với Java',  N'tinnp', CAST(0x0A410B00 AS Date)),
 (N'JAV04', 200, 70, CAST(0xF6400B00 AS Date), N'Lập trình ứng dụng Desktop với Java', N'tinnp', CAST(0x0A410B00 AS Date)),
 (N'PRO01', 300, 90, CAST(0xF6400B00 AS Date), N'Lập trình .NET MVC',  N'tinnp', CAST(0x0A410B00 AS Date)),
 (N'PRO02', 300, 90, CAST(0xF6400B00 AS Date), N'Lập trình Spring MVC',  N'tinnp', CAST(0x0A410B00 AS Date)),
(N'PRO03', 300, 90, CAST(0xF6400B00 AS Date), N'Làm dự án với Servlet và JSP',  N'tinnp', CAST(0x0A410B00 AS Date)),
 (N'PRO04', 300, 90, CAST(0xF6400B00 AS Date), N'Làm dự án với REST API và AngularJS', N'tinnp', CAST(0x0A410B00 AS Date)),
 (N'JAV01', 300, 90, CAST(0xF4400B00 AS Date), N'Lập trình Java cơ bản', N'tinnp', CAST(0x0A410B00 AS Date)),
(N'JAV01', 250, 90, CAST(0xF2400B00 AS Date), N'Lập trình Java cơ bản',  N'tinnp', CAST(0x0A410B00 AS Date))
--Thêm dữ liệu vào bảng người học
insert into NguoiHoc values
 (N'PS01638', N'LỮ HUY CƯỜNG',CAST(N'1991-05-08' AS Date),1, N'0928768265', N'PS01638@fpt.edu.vn', N'0928768265 - LỮ HUY CƯỜNG', N'phongtd', CAST(N'1991-05-08' AS Date)),
 (N'PS02037', N'ĐỖ VĂN MINH',CAST(N'1992-10-24' AS Date),0, N'0968095685', N'PS02037@fpt.edu.vn', N'0968095685 - ĐỖ VĂN MINH', N'phongtd', CAST(N'1992-10-24' AS Date)),
 (N'PS02771', N'NGUYỄN TẤN HIẾU',CAST(N'1998-09-15' AS Date),1, N'0927594734', N'PS02771@fpt.edu.vn', N'0927594734 - NGUYỄN TẤN HIẾU', N'tinnp', CAST(N'1998-09-15' AS Date)),
(N'PS02867', N'NGUYỄN HỮU TRÍ',CAST(N'1997-10-27' AS Date),1, N'0946984711', N'PS02867@fpt.edu.vn', N'0946984711 - NGUYỄN HỮU TRÍ', N'tinnp', CAST(N'1997-10-27' AS Date)),
(N'PS02772', N'NGUYỄN TẤN HIẾU',CAST(N'1998-09-15' AS Date),1, N'0927594734', N'PS02771@fpt.edu.vn', N'0927594734 - NGUYỄN TẤN HIẾU', N'phongtd', CAST(N'1998-09-15' AS Date)),
(N'PS02868', N'NGUYỄN HỮU TRÍ',CAST(N'1997-10-27' AS Date),1, N'0946984711', N'PS02867@fpt.edu.vn', N'0946984711 - NGUYỄN HỮU TRÍ', N'tinnp', CAST(N'1997-10-27' AS Date)),
(N'PS02930', N'TRẦN VĂN NAM',CAST(N'2000-06-03' AS Date),0, N'0924774498', N'PS02930@fpt.edu.vn', N'0924774498 - TRẦN VĂN NAM', N'tinnp', CAST(N'2000-06-03' AS Date)),
 (N'PS02979', N'ĐOÀN TRẦN NHẬT VŨ',CAST(N'1994-08-28' AS Date),0, N'0912374818', N'PS02979@fpt.edu.vn', N'0912374818 - ĐOÀN TRẦN NHẬT VŨ', N'tinnp', CAST(N'1994-08-28' AS Date)),
(N'PS02983', N'NGUYỄN HOÀNG THIÊN PHƯỚC',CAST(N'1993-04-04' AS Date),0, N'0912499836', N'PS02983@fpt.edu.vn', N'0912499836 - NGUYỄN HOÀNG THIÊN PHƯỚC', N'Phongtd', CAST(N'1993-04-04' AS Date)),
 (N'PS02988', N'HỒ HỮU HẬU',CAST(N'1993-02-08' AS Date),1, N'0924984876', N'PS02988@fpt.edu.vn', N'0924984876 - HỒ HỮU HẬU', N'nghiemn', CAST(N'1993-02-08' AS Date))
--Thêm dữ liệu vào bảng học viên
insert into HocVien(MaKH,MaNH,Diem)
values(1,'PS001',9)
insert into HocVien(MaKH,MaNH,Diem)
values(2,'PS003',8)
insert into HocVien(MaKH,MaNH,Diem)
values(1,'PS002',6)
delete from HocVien
delete from KhoaHoc
delete from ChuyenDe
delete from NguoiHoc

create trigger deleteNguoiHoc on NguoiHoc
INStead of delete as
begin
	--Tạo @id để tránh khóa ngoại của MaSV
	declare @id NCHAR(7);
	--Gán MaSV cho @id
	select @id=MaNH from deleted;
	--Xóa thông tin 2 bảng STUDENTS VÀ GRADE
	delete from NguoiHoc where MaNH=@id;
	delete from HocVien where MaNH=@id;
end

create trigger UpdateNguoiHoc on NguoiHoc
INStead of update as
begin
	--Tạo @id để tránh khóa ngoại của MaSV
	declare @id NCHAR(7);
	--Gán MaSV cho @id
	select @id=MaNH from inserted;
	--Xóa thông tin 2 bảng STUDENTS VÀ GRADE
	update NguoiHoc set HoTen=  where MaNH=@id;
	delete from HocVien where MaNH=@id;
end

--proc BangDiem
CREATE PROC sp__BangDiem(@MaKH INT)
as
begin
	select NH.MaNH,NH.HoTen,HV.Diem from HocVien HV
	INNER JOIN NguoiHoc NH on HV.MaNH=NH.MaNH
	where MaKH=@MaKH
	ORDER BY HV.Diem DESC
end
--proc NguoiHoc
GO
CREATE PROC sp_NguoiHoc
as
begin
	select YEAR(NgayDK) Nam,COUNT(*) SoLuong,min(NgayDK) DauTien,max(NgayDK) CuoiCung 
	from NguoiHoc
	GROUP BY YEAR(NgayDK)
end 
--Proc Điểm chuyên đề
CREATE PROC sp_ThongKeDiem
as
begin
	select TenCD ChuyenDe,COUNT(MaHV) SoLuong,min(Diem) DiemTN,max(Diem) DiemCN,AVG(Diem) DiemTB  from KhoaHoc KH
	INNER JOIN HocVien HV on KH.MaKH=HV.MaKH 
	INNER JOIN ChuyenDe CD on KH.MACD=CD.MaCD
	GROUP BY TenCD
end
--proc Doanh thu
CREATE PROC sp_DoanhThu (@year int)
as
begin--Chuyên đề,Khóa học,học viên,
	select TenCD ChuyenDe,COUNT(DISTINCT kh.MaKH) SoKH,COUNT(HV.MaHV) SoHV ,
		SUM(KH.HocPhi) DoanhThu,MIN(KH.HocPhi) HocPhiThapNhat,MAX(KH.HocPhi) HocPhiCaoNhat,
		AVG(KH.HocPhi) HocPhiTrungBinh
	from KhoaHoc KH
	INNER JOIN ChuyenDe CD ON KH.MACD=CD.MaCD
	INNER JOIN HocVien HV ON KH.MaKH=HV.MaKH
	where YEAR(NgayKG)=@year
	group by TenCD

end



