package com.tanqui.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {
	private String masv;
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	private String diemtb;
}
