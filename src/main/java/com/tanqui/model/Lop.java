package com.tanqui.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lop {
	private String maLop;
	private String tenLop;
	private List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
}
