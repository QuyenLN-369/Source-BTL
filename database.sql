create database quanlyphongkham;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

use quanlyphongkham;
CREATE TABLE `benhnhan` (
  `maBenhNhan` varchar(6) NOT NULL,
  `tenBenhNhan` varchar(30) NOT NULL,
  `gioiTinh` int(11) NOT NULL,
  `ngaySinh` date NOT NULL,
  `ngheNghiep` varchar(30) NOT NULL,
  `tinhTrangHonNhan` int(11) NOT NULL COMMENT 'tình trạng hôn nhân: 0-độc thân, 1 - đã kết hôn',
  `diaChi` varchar(200) DEFAULT NULL,
  `tieuSuBenhAn` varchar(200) DEFAULT NULL COMMENT 'tiền sử bệnh của người nhà, bản thân',
  `soDienThoai` varchar(50) DEFAULT NULL,
  `soCMND` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='VD mã bệnh nhân: BN0001\r\nGiới tính: 0-Nữ, 1 - Nam';

--
-- Dumping data for table `benhnhan`
--

INSERT INTO `benhnhan` (`maBenhNhan`, `tenBenhNhan`, `gioiTinh`, `ngaySinh`, `ngheNghiep`, `tinhTrangHonNhan`, `diaChi`, `tieuSuBenhAn`, `soDienThoai`, `soCMND`) 
VALUES
('BN01', 'Nguyen Manh Son', 1, '1987-11-16', 'giang vien', 0, 'ha noi', 'khong', '01634480019', '168563678'),
('BN02', 'Le Van Bang', 1, '2003-11-16', 'sinh vien', 0, 'thanh hoa', 'khong', '01634480019', '168563678');

-- --------------------------------------------------------

--
-- Table structure for table `donthuoc`
--

CREATE TABLE `donthuoc` (
  `maDonThuoc` int(6) NOT NULL,
  `maBenhNhan` varchar(6) NOT NULL,
  `maDuocSi` varchar(6) NOT NULL COMMENT 'Người lấy thuốc cho bệnh nhân',
  `maBacSi` varchar(6) NOT NULL COMMENT 'Người bác sĩ kê đơn',
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

--
-- Table structure for table `donthuocchitiet`
--

CREATE TABLE `donthuocchitiet` (
  `maDonThuocChiTiet` int(6) NOT NULL,
  `maDonThuoc` int(6) NOT NULL,
  `maThuoc` varchar(6) NOT NULL,
  `soLuong` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNhanVien` varchar(6) NOT NULL COMMENT 'maNhanVien: NV0001',
  `hoTen` varchar(30) NOT NULL,
  `ngaySinh` date NOT NULL,
  `gioiTinh` varchar(11) DEFAULT NULL,
  `chucVu` varchar(50) NOT NULL,
  `diaChi` varchar(200) NOT NULL,
  `soDienThoai` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `soCMND` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`maNhanVien`, `hoTen`, `ngaySinh`, `gioiTinh`, `chucVu`, `diaChi`, `soDienThoai`, `email`, `soCMND`, `password`) VALUES
('NV0001', 'Tran Anh Son', '2003-03-13', 'Nam', 'Nhân viên lễ tân', 'Nam Định', '01278080007', 'sonta97@gmail.com', '123456789', '123'),
('BS0001', 'Le Ngoc Quyen', '2003-09-17', 'Nam', 'Bác sĩ đa khoa', 'Thanh Hóa', '1234567898', 'quyenln@gmail.com', '123456789', '123456'),
('XN0001', 'Dang Minh Anh', '2003-10-10', 'Nam', 'Nhân viên xét nghiệm', 'Hà Nội', '1234567898', 'anhdm@gmail.com', '321654987', '123456'),
('DS0001', 'Lai The Hoa', '2003-12-12', 'Nam', 'Dược sĩ', 'Hà Nội', '1234567898', 'hoalt', 'hoalt@gmail.com', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `phieukham`
--

CREATE TABLE `phieukham` (
  `maPhieuKham` varchar(6) NOT NULL COMMENT 'maPhieuKham: PK0001',
  `maNhanVien` varchar(6) NOT NULL,
  `maBenhNhan` varchar(6) NOT NULL,
  `lyDoKham` varchar(200) NOT NULL COMMENT 'Khi vào nhân viên lễ tân hỏi và ghi lại triệu chứng vào phần lí do khám',
  `ghiChu` varchar(200) DEFAULT NULL,
  `tenBacSi` varchar(50) DEFAULT NULL,
  `thanhToan` double DEFAULT NULL,
  `ngayKham` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `phieukhamchitiet`
--

CREATE TABLE `phieukhamchitiet` (
  `maPhieuKhamChiTiet` varchar(6) NOT NULL COMMENT 'maPhieuKhamChiTiet: CT0001',
  `maBenhNhan` varchar(6) NOT NULL,
  `maNhanVien` varchar(6) NOT NULL COMMENT 'mã của bác sĩ thực hiện',
  `ngayKham` date NOT NULL,
  `chiSoSucKhoe` varchar(200) DEFAULT NULL COMMENT 'Đo đạc, xét nghiệm được những gì sẽ ghi vào mục này',
  `ketLuan` varchar(200) NOT NULL,
  `yeuCau` varchar(200) DEFAULT NULL COMMENT 'yêu cầu bệnh nhân đi khám tiếp ai, phòng nào, hoặc bốc thuốc thì đơn thuốc ra làm sao sẽ ghi vào đây',
  `maPhieuKham` varchar(6) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `thuoc`
--

CREATE TABLE `thuoc` (
  `maThuoc` varchar(6) NOT NULL COMMENT 'VD: MT0001',
  `tenThuoc` varchar(50) NOT NULL,
  `soLuong` int(11) NOT NULL,
  `donGia` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `thuoc`
--

INSERT INTO `thuoc` (`maThuoc`, `tenThuoc`, `soLuong`, `donGia`) VALUES
('PN1', 'panadon', 18, 5000),
('TX1', 'trixadon', 34, 7000),
('QR1', 'quaradon', 12, 8000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `benhnhan`
--
ALTER TABLE `benhnhan`
  ADD PRIMARY KEY (`maBenhNhan`);

--
-- Indexes for table `donthuoc`
--
ALTER TABLE `donthuoc`
  ADD PRIMARY KEY (`maDonThuoc`),
  ADD KEY `fk2` (`maBenhNhan`),
  ADD KEY `fk3` (`maDuocSi`),
  ADD KEY `fk4` (`maBacSi`);

--
-- Indexes for table `donthuocchitiet`
--
ALTER TABLE `donthuocchitiet`
  ADD PRIMARY KEY (`maDonThuocChiTiet`),
  ADD KEY `fk1` (`maDonThuoc`),
  ADD KEY `fk2` (`maThuoc`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNhanVien`);

--
-- Indexes for table `phieukham`
--
ALTER TABLE `phieukham`
  ADD PRIMARY KEY (`maPhieuKham`),
  ADD KEY `fk1` (`maNhanVien`),
  ADD KEY `fk2` (`maBenhNhan`);

--
-- Indexes for table `phieukhamchitiet`
--
ALTER TABLE `phieukhamchitiet`
  ADD PRIMARY KEY (`maPhieuKhamChiTiet`),
  ADD KEY `fk1` (`maBenhNhan`),
  ADD KEY `fk2` (`maNhanVien`),
  ADD KEY `fk3` (`maPhieuKham`);

--
-- Indexes for table `thuoc`
--
ALTER TABLE `thuoc`
  ADD PRIMARY KEY (`maThuoc`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donthuoc`
--
ALTER TABLE `donthuoc`
  MODIFY `maDonThuoc` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `donthuocchitiet`
--
ALTER TABLE `donthuocchitiet`
  MODIFY `maDonThuocChiTiet` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;
