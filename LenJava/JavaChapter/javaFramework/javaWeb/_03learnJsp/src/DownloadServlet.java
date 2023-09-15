import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Encoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取需要下载的文件名(/为web目录下)
        String downloadFilePath="/ob.png";
//        读取要下载的文件内容
        ServletContext servletContext = getServletContext();
//        获取要下载的文件类型
        String mimeType = servletContext.getMimeType( downloadFilePath);
//        回传前通过响应头告诉客户端返回的数据类型
        resp.setContentType(mimeType);
//        告诉客户端收到的数据用于下载
//        判断用户浏览器类型
        if(req.getHeader("User-Agent").contains("Firefox")){
            //火狐浏览器
            resp.setHeader("Content-Disposition","attachment;filename==?UTF-8?B?"+ new BASE64Encoder().encode(downloadFilePath.getBytes("UTF-8"))+"?=");//filename设置文件加载时文件名
        }else{
            resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(downloadFilePath,"UTF-8"));//filename设置文件加载时文件名
        }


        InputStream resourceAsStream = servletContext.getResourceAsStream( downloadFilePath);
//获取响应输出流
        ServletOutputStream outputStream = resp.getOutputStream();
        IOUtils.copy(resourceAsStream,outputStream);
        System.out.println(111);

    }
}
