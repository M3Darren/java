package lenxml.test;

import lenxml.pojo.Book;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class Dom4jTest {
 @Test
    public void test1(){
     SAXReader saxReader = new SAXReader();//创建SAXReader输入流，读取xml配置文件，生成document对象
     try {
         Document read = saxReader.read("src/books.xml");//读取文件
         Element rootElement = read.getRootElement();//找到配置文件的根元素
//         System.out.println(rootElement);
//         使用elements()获取多个子元素
         List<Element> books = rootElement.elements("book");
         for (Element book :books){
//             System.out.println(book);
             String name = book.elementText("name");//获取子元素内容
             String price = book.elementText("price");
             String author = book.elementText("author");
             String sn = book.attributeValue("sn");//获取当前元素属性值
             System.out.println(new Book(sn,name,Double.parseDouble(price),author));
         }
     } catch (Exception e) {
        e.printStackTrace();
     }
 }

}
