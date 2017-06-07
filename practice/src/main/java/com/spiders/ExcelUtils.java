package com.spiders;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.CellFormat;
import jxl.format.Colour;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 * @author Administrator
 *
 */
public class ExcelUtils {

	// 读Excel文件
	public static void readExcel() throws BiffException, IOException {
		// 创建一个list 用来存储读取的内容
		List list = new ArrayList();
		Workbook rwb = null;
		Cell cell = null;

		// 创建输入流
		InputStream stream = new FileInputStream("d:\\testJXL.xls");

		// 获取Excel文件对象
		rwb = Workbook.getWorkbook(stream);

		// 获取文件的指定工作表 默认的第一个
		Sheet sheet = rwb.getSheet(0);

		// 行数(表头的目录不需要，从1开始)
		for (int i = 0; i < sheet.getRows(); i++) {

			// 创建一个数组 用来存储每一列的值
			String[] str = new String[sheet.getColumns()];

			// 列数
			for (int j = 0; j < sheet.getColumns(); j++) {

				// 获取第i行，第j列的值
				cell = sheet.getCell(j, i);
				str[j] = cell.getContents();

			}
			// 把刚获取的列存入list
			list.add(str);
		}
		for (int i = 0; i < list.size(); i++) {
			String[] str = (String[]) list.get(i);
			for (int j = 0; j < str.length; j++) {
				System.out.println(str[j]);
			}
		}
	}

	/**
	 * 导出excel
	 * 
	 * @param filePath 文件名
	 * @param title 标题
	 * @param data 数据内容
	 */
	public static void writeExcel(String filePath, String[] title, String[][] data) {
		try {
			WritableWorkbook wwb;
			OutputStream os = new FileOutputStream(filePath);
			wwb = Workbook.createWorkbook(os);
			WritableSheet sheet = wwb.createSheet("产品清单", 0);
			Label label;
			for (int i = 0; i < title.length; i++) {
				label = new Label(i, 0, title[i]);
				sheet.addCell(label);
			}

			for (int row = 0; row < data.length; row++) {
				for (int col = 0; col < data[row].length; col++) {
					label = new Label(col, row + 1, data[row][col]);
					sheet.addCell(label);
				}
			}

			wwb.write();
			wwb.close();
		} catch (Exception e) {
			System.out.println("---出现异常---");
			e.printStackTrace();
		}
	}

	// /**
	// * 设置头的样式
	// *
	// * @return
	// */
	// public static WritableCellFormat getHeader() {
	// WritableCellFormat format = null;
	// try {
	// WritableFont font = new WritableFont(WritableFont.TIMES, 10,
	// WritableFont.BOLD);// 定义字体
	// font.setColour(Colour.BLUE);// 蓝色字体
	// format = new WritableCellFormat(font);
	// format.setAlignment(jxl.format.Alignment.CENTRE);// 左右居中
	// format.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);// 上下居中
	// format.setBorder(Border.ALL, BorderLineStyle.THIN, Colour.BLACK);// 黑色边框
	// format.setBackground(Colour.YELLOW);// 黄色背景
	// } catch (WriteException e) {
	// e.printStackTrace();
	// }
	// return format;
	// }

}
