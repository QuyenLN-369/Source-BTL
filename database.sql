
create database quanlyphongkham;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

use quanlyphongkham;
------------------------------------------

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

--
-- Dumping data for table `donthuoc`
--

INSERT INTO `donthuoc` (`maDonThuoc`, `maBenhNhan`, `maDuocSi`, `maBacSi`, `ngayLayThuoc`, `tongTien`) VALUES
(2, 'aaa', '21', '24', '2023-02-02', 20),
(3, 'bbb', '24', '21', '2023-02-02', 30);

-- --------------------------------------------------------


/* CREATE TABLE `donthuocchitiet` (
  `maDonThuocChiTiet` int(6) NOT NULL,
  `maDonThuoc` int(6) NOT NULL,
  `maThuoc` varchar(6) NOT NULL,
  `soLuong` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8; */

-- --------------------------------------------------------



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

--

INSERT INTO `nhanvien` (`maNhanVien`, `hoTen`, `ngaySinh`, `gioiTinh`, `chucVu`, `diaChi`, `soDienThoai`, `email`, `soCMND`, `password`) VALUES
('NV001', 'Tran Anh Son', '2003-03-13', 'Nam', 'Nhân viên lễ tân', 'Nam Định', '0127877777', 'sonta97@gmail.com', '123456789', '123'),
('BS001', 'Le Ngoc Quyen', '2003-09-17', 'Nam', 'Bác sĩ đa khoa', 'Thanh Hóa', '0868999999', 'quyenln@gmail.com', '888888888', '123456'),
('BS002', 'Nguyen Minh Quan', '2003-09-28', 'Nam', 'Bác sĩ chuyên khoa', 'Thanh Hóa', '0797888888', 'quannm@gmail.com', '1239123129', '123456'),
('BS003', 'Dang Minh Anh', '2003-10-10', 'Nam', 'Bác  sĩ chuyên khoa', 'Hà Nội', '0868555555', 'anhdm@gmail.com', '999999999', '123456'),
('DS001', 'Lai The Hoa', '2003-12-12', 'Nam', 'Dược sĩ', 'Hà Nội', '0898456789', 'hoalt@gmail.com', '0294723842', '111111');

-- --------------------------------------------------------

CREATE TABLE `phieukhamchitiet` (
  `maPhieuKham` varchar(6) NOT NULL,
  `maBenhNhan` varchar(6) NOT NULL,
  `maNhanVien` varchar(6) NOT NULL COMMENT 'mã của bác sĩ thực hiện',
  `ngayKham` date NOT NULL,
  `KhuyenNghi` varchar(200) DEFAULT NULL,
  `ketLuan` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------
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
--

INSERT INTO `benhnhan` (`maBenhNhan`, `tenBenhNhan`, `gioiTinh`, `ngaySinh`, `ngheNghiep`, `tinhTrangHonNhan`, `diaChi`, `tieuSuBenhAn`, `soDienThoai`, `soCMND`) 
VALUES
('BN02', 'Le Van Bang', 'nam', '2003-11-16', 'sinh vien', 0, 'thanh hoa', 'khong', '01634480019', '168563678');

-
--

CREATE TABLE `thuoc` (
  `maThuoc` varchar(6) NOT NULL,
  `tenThuoc` varchar(50) NOT NULL,
  `soLuong` int(11) NOT NULL,
  `donGia` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--

--

INSERT INTO `thuoc` (`maThuoc`, `tenThuoc`, `soLuong`, `donGia`) VALUES
('PN1', 'panadon', 18, 5000),
('TX1', 'trixadon', 34, 7000),
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
