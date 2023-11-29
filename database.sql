
create database quanlyphongkham;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

use quanlyphongkham;


CREATE TABLE `donthuoc` (
  `maDonThuoc` int(6) NOT NULL,
  `maBenhNhan` varchar(6) NOT NULL,
  `maDuocSi` varchar(6) NOT NULL COMMENT 'Người lấy thuốc cho bệnh nhân',
  `maBacSi` varchar(6) NOT NULL COMMENT 'Người bác sĩ kê đơn',
  `tenThuoc` varchar(50) NOT NULL,
  `soLuong` int(11) NOT NULL,
  `ngayLayThuoc` date NOT NULL,
  `tongTien` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;



INSERT INTO `donthuoc` (`maDonThuoc`, `maBenhNhan`, `maDuocSi`, `maBacSi`, `ngayLayThuoc`, `tongTien`) VALUES
(1, 'BN01', 'DS01', 'BS02', '2023-12-10', 20000),
(2, 'BN02', 'DS01', 'BS01', '2023-02-11', 10000),
(3, 'BN03', 'DS01', 'BS03', '2023-27-11', 40000),
(4, 'BN04', 'DS01', 'BS03', '2023-28-11', 18000),
(5, 'BN05', 'DS01', 'BS02', '2023-29-11', 30000);

/* CREATE TABLE `donthuocchitiet` (
  `maDonThuocChiTiet` int(6) NOT NULL,
  `maDonThuoc` int(6) NOT NULL,
  `maThuoc` varchar(6) NOT NULL,
  `soLuong` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8; */



CREATE TABLE `nhanvien` (
  `maNhanVien` varchar(6) NOT NULL COMMENT 'maNhanVien: NV0001',
  `hoTen` varchar(30) NOT NULL,
  `ngaySinh` date NOT NULL,
  `gioiTinh` varchar(11) NOT NULL,
  `chucVu` varchar(50) NOT NULL,
  `diaChi` varchar(200) NOT NULL,
  `soDienThoai` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `soCMND` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


INSERT INTO `nhanvien` (`maNhanVien`, `hoTen`, `ngaySinh`, `gioiTinh`, `chucVu`, `diaChi`, `soDienThoai`, `email`, `soCMND`, `password`) VALUES
('NV01', 'Tran Anh Son', '2003-03-13', 'Nam', 'Nhân viên lễ tân', 'Nam Định', '0127877777', 'sonta97@gmail.com', '123456789', '123'),
('BS01', 'Le Ngoc Quyen', '2003-09-17', 'Nam', 'Bác sĩ đa khoa', 'Thanh Hóa', '0868999999', 'quyenln@gmail.com', '888888888', '123456'),
('BS02', 'Nguyen Minh Quan', '2003-09-28', 'Nam', 'Bác sĩ chuyên khoa', 'Thanh Hóa', '0797888888', 'quannm@gmail.com', '1239123129', '123456'),
('BS03', 'Dang Minh Anh', '2003-10-10', 'Nam', 'Bác  sĩ chuyên khoa', 'Hà Nội', '0868555555', 'anhdm@gmail.com', '999999999', '123456'),
('DS01', 'Lai The Hoa', '2003-12-12', 'Nam', 'Dược sĩ', 'Hà Nội', '0898456789', 'hoalt@gmail.com', '0294723842', '111111');


CREATE TABLE `phieukhamchitiet` (
  `maPhieuKham` varchar(6) NOT NULL,
  `maBenhNhan` varchar(6) NOT NULL,
  `maNhanVien` varchar(6) NOT NULL COMMENT 'mã của bác sĩ thực hiện',
  `ngayKham` date NOT NULL,
  `KhuyenNghi` varchar(200) DEFAULT NULL,
  `ketLuan` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

INSERT INTO `phieukhamchitiet` (`maPhieuKham`, `maBenhNhan`, `maNhanVien`, `ngayKham`, `KhuyenNghi`, `ketLuan`)
VALUES 
('PK0001', 'BN01', 'BS01', '2023-12-10', 'Uống thuốc theo đúng liều lượng', 'Không có vấn đề đặc biệt'),
('PK0002', 'BN02', 'BS02', '2023-02-11', 'Nghỉ ngơi đầy đủ', 'Dấu hiệu của mệt mỏi'),
('PK0003', 'BN03', 'BS03', '2023-27-11', 'Tập thể dục đều đặn', 'Chưa có vấn đề gì đặc biệt'),
('PK0004', 'BN04', 'BS02', '2023-28-11', 'Kiểm tra lại sau 2 tuần', 'Cần theo dõi tình trạng sức khỏe'),
('PK0005', 'BN05', 'BS03', '2023-29-11', NULL, 'Không có vấn đề đặc biệt');


CREATE TABLE `benhnhan` (
  `maBenhNhan` varchar(6) NOT NULL,
  `tenBenhNhan` varchar(30) NOT NULL,
  `maPhieuKham` varchar(6) NOT NULL COMMENT 'maPhieuKham: PK0001',
  `gioiTinh` varchar(6) NOT NULL,
  `ngaySinh` date NOT NULL,
  `ngheNghiep` varchar(30) NOT NULL,
  `tinhTrangHonNhan` varchar(30) NOT NULL,
  `diaChi` varchar(200) DEFAULT NULL,
   `soDienThoai` varchar(50) NOT NULL,
  `soCMND` varchar(30) NOT NULL,
  `tieuSuBenhAn` varchar(200) DEFAULT NULL COMMENT 'tiền sử bệnh của người nhà, bản thân',
  `TrieuChung` varchar(200) NOT NULL COMMENT 'Khi vào nhân viên lễ tân hỏi và ghi lại triệu chứng vào phần lí do khám',
  `ghiChu` varchar(200) DEFAULT NULL
 
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


INSERT INTO `benhnhan` (`maBenhNhan`, `tenBenhNhan`, `gioiTinh`, `ngaySinh`, `ngheNghiep`, `tinhTrangHonNhan`, `diaChi`, `tieuSuBenhAn`, `soDienThoai`, `soCMND`) 
VALUES
('BN01', 'Le Đức Anh', 'nam', '2003-08-16', 'sinh viên', 0, 'Thanh Hóa', 'không', '01634480019', '8192739123'),
('BN02', 'Trần Văn An', 'nam', '2003-11-15', 'công nhân', 0, 'Hà Nội', 'không', '01634861982', '786283232'),
('BN03', 'Lê Yến Nhi', 'nữ', '2003-10-16', 'học sinh', 0, 'Nghệ An', 'không', '01657138119', '6981273912'),
('BN04', 'Lê Văn Bằng', 'nam', '2003-09-06', 'lập trình viên', 0, 'Quảng Ninh', 'không', '01639287119', '812638120'),
('BN05', 'Nguyễn Hữu Hiếu', 'nam', '2003-01-18', 'sinh viên', 0, 'Hải Phòng', 'không', '01687292219', '9172812301');


CREATE TABLE `thuoc` (
  `maThuoc` varchar(6) NOT NULL,
  `tenThuoc` varchar(50) NOT NULL,
  `soLuong` int(11) NOT NULL,
  `donGia` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


INSERT INTO `thuoc` (`maThuoc`, `tenThuoc`, `soLuong`, `donGia`) VALUES
('PN1', 'panadon', 18, 5000),
('TX1', 'trixadon', 34, 7000),
('PT1', 'pentadon', 34, 9000),
('QR1', 'quaradon', 12, 8000);


--

--
ALTER TABLE `benhnhan`
  ADD PRIMARY KEY (`maBenhNhan`);

--

--
ALTER TABLE `donthuoc`
  ADD PRIMARY KEY (`maDonThuoc`),
  ADD KEY `fk2` (`maBenhNhan`),
  ADD KEY `fk3` (`maDuocSi`),
  ADD KEY `fk4` (`maBacSi`);

--

--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNhanVien`);

--
--
ALTER TABLE `phieukhamchitiet`
  ADD PRIMARY KEY (`maPhieuKham`),
  ADD KEY `fk1` (`maBenhNhan`),
  ADD KEY `fk2` (`maNhanVien`),
  ADD KEY `fk3` (`maPhieuKham`);

--

--
ALTER TABLE `thuoc`
  ADD PRIMARY KEY (`tenThuoc`);

--

--
ALTER TABLE `donthuoc`
  MODIFY `maDonThuoc` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--

COMMIT;
