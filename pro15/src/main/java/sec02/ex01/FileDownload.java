package sec02.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.do")
public class FileDownload extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		handle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		handle(request, response);
	}

	protected void handle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String file_repo = "D:\\ckd.java\\pro15\\src\\main\\webapp\\image";
		String fileName = (String) request.getParameter("fileName");
		System.out.println("fileName=" + fileName);

		try {
			OutputStream out = response.getOutputStream();
			String downFile = file_repo + "\\" + fileName;
			File f = new File(downFile);
			response.setHeader("Cache-Control", "no-cache");
			response.addHeader("Content-disposition", "attachment; fileName="+fileName);
			
			FileInputStream in = new FileInputStream(f);
			byte[] buffer = new byte[1024 * 8];
			while (true) {
				int count = in.read(buffer);
				if (count == -1)
					break;
				out.write(buffer, 0, count);
			}
			in.close();
			out.close();

		} catch (Exception e) {
			System.out.println("파일 다운로드 요청에서 예외 발생");
//		e.printStackTrace();
		}
	}
}