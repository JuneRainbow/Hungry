package org.apache.jsp.web2017;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class happyJune_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"zh-CN\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>那些年你想吃又吃不到的东西</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("<style>\n");
      out.write("* { margin: 0; padding: 0;}\n");
      out.write("ul { list-style-type: none;}\n");
      out.write("body { font: 14px \"Microsoft Yahei\"; overflow-x: hidden; background-color: #2B2B2B; }\n");
      out.write("h1 { width: 900px; margin: 40px auto 100px; font: 32px \"Microsoft Yahei\"; text-align: center; color: #D3D3D3; }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-1.8.3.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(function(){\n");
      out.write("\tvar $animate = $('#animate');\n");
      out.write("\tvar $opposite = $('#opposite');\n");
      out.write("\t$(\".wrap\").hover(function(){\n");
      out.write("\t\t$animate.removeClass();\n");
      out.write("\t\t$opposite.removeClass();\n");
      out.write("\t\t$animate.addClass(\"test\");\n");
      out.write("\t\t$opposite.addClass('test2');\n");
      out.write("\t},function(){\n");
      out.write("\t\t$animate.removeClass();\n");
      out.write("\t\t$opposite.removeClass();\n");
      out.write("\t\t$animate.addClass(\"test2\");\n");
      out.write("\t\t$opposite.addClass('test');\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$(\".well-item\").hover(function(){\n");
      out.write("\t\t$(this).find(\".correct\").children().removeClass();\n");
      out.write("\t\t$(this).find(\".opposite\").children().removeClass();\n");
      out.write("\t\t$(this).find(\".correct\").children().addClass(\"test\");\n");
      out.write("\t\t$(this).find(\".opposite\").children().addClass('test2');\n");
      out.write("\t},function(){\n");
      out.write("\t\t$(this).find(\".correct\").children().removeClass();\n");
      out.write("\t\t$(this).find(\".opposite\").children().removeClass();\n");
      out.write("\t\t$(this).find(\".correct\").children().addClass(\"test2\");\n");
      out.write("\t\t$(this).find(\".opposite\").children().addClass('test');\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1>那些年你想吃又吃不到的东西</h1>\n");
      out.write("<div class=\"well\">\n");
      out.write("\t<div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro5.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=1\">\n");
      out.write("\t\t\t\t\t\t请我吃鳗鱼饭！\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro7.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=2\">\n");
      out.write("\t\t\t\t\t\t请我吃饭团！\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("        <div class=\"correct\"><img  class=\"\" src=\"img/pro8.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=3\">\n");
      out.write("                                            请我吃拉面！\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro9.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=4\">\n");
      out.write("\t\t\t\t\t\t请我吃雪糕！\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro10.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=5\">\n");
      out.write("\t\t\t\t\t\t请我吃鱼蛋！\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro11.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=6\">\n");
      out.write("\t\t\t\t\t\t请我吃串串！\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro12.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=7\">\n");
      out.write("\t\t\t\t\t\t请我喝奶茶！\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro13.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("                                    <div class=\"opposite-content-text\"><a href=\"success.jsp?a=8\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t请我吃龙虾！\n");
      out.write("                                        </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro1.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=9\">\n");
      out.write("\t\t\t\t\t\t请我吃烤鱼！\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro2.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=10\">\n");
      out.write("\t\t\t\t\t\t请我吃火锅！\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro3.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=11\">\n");
      out.write("\t\t\t\t\t\t请我吃披萨!\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro4.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=12\">\n");
      out.write("\t\t\t\t\t\t请我吃牛排！\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"text-align:center;clear:both;margin-top:50px;\">\n");
      out.write("<script src=\"/gg_bd_ad_720x90.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"/follow.js\" type=\"text/javascript\"></script>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
