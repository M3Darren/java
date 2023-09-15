import org.apache.commons.fileupload.FileItem;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         if(ServletFileUpload.isMultipartContent(req)){
             DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
             ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
             //解析上传数据
             try {
                 List<FileItem> fileItems = servletFileUpload.parseRequest(req);
                 for (FileItem fileItem:fileItems){
                     if (fileItem.isFormField()){
                         //普通表单项
                         System.out.println("表单项的name："+fileItem.getFieldName());
                         System.out.println("表单的value："+fileItem.getString());
                     }else{
                         //上传的文件
                         System.out.println("表单项的name："+fileItem.getFieldName());
                         System.out.println("上传的文件名："+fileItem.getName());
                         fileItem.write(new File("e:\\upload"+fileItem.getName()));
                     }
                 }
             } catch (Exception e) {
                 throw new RuntimeException(e);
             }
         }else{
             System.out.println("当前数据不是多段形式");
         }
    }
}
