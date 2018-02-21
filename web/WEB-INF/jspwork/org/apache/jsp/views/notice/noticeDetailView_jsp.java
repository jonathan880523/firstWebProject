/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.44
 * Generated at: 2017-07-21 11:00:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import notice.model.vo.Notice;
import member.model.vo.Member;

public final class noticeDetailView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("notice.model.vo.Notice");
    _jspx_imports_classes.add("member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");

	Notice notice = (Notice)request.getAttribute("notice");
	String fileName = null;
	if(notice.getFilePath() != null){
		fileName = notice.getFilePath()
			.substring(notice.getFilePath().lastIndexOf("/") + 1);
	}
	
	Member member = (Member)session.getAttribute("member");

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>noticeDetailView</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1 align=\"center\"> ");
      out.print( notice.getNoticeNo() );
      out.write("번글 상세 보기</h1>\r\n");
      out.write("<br><br>\r\n");
      out.write("<table align=\"center\">\r\n");
      out.write("\t<tr><td>번호</td><td>");
      out.print( notice.getNoticeNo() );
      out.write("</td></tr>\r\n");
      out.write("\t<tr><td>제목</td><td>");
      out.print( notice.getNoticeTitle() );
      out.write("</td></tr>\r\n");
      out.write("\t<tr><td>작성자</td><td>");
      out.print( notice.getNoticeWriter() );
      out.write("</td></tr>\r\n");
      out.write("\t<tr><td>올린날짜</td><td>");
      out.print( notice.getNoticeDate() );
      out.write("</td></tr>\r\n");
      out.write("\t");
 if(fileName != null){ 
      out.write("\r\n");
      out.write("\t<tr><td>첨부파일</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<a href=\"/first/nfdown?path=");
      out.print( notice.getFilePath() );
      out.write("\">\r\n");
      out.write("\t\t");
      out.print( fileName );
      out.write("</a>\r\n");
      out.write("\t\t</td></tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<tr><td>내용</td><td>");
      out.print( notice.getNoticeContent() );
      out.write("</td></tr>\r\n");
      out.write("\t");
 if(member.getId().equals(notice.getNoticeWriter()) == true){ 
      out.write("\t\r\n");
      out.write("\t<tr><td colspan=\"2\" align=\"center\"> \r\n");
      out.write("\t<a href=\"/first/nupview?no=");
      out.print( notice.getNoticeNo() );
      out.write("\">수정페이지로 이동</a> &nbsp; &nbsp;\r\n");
      out.write("\t<a href=\"/first/ndelete?no=");
      out.print( notice.getNoticeNo() );
      out.write("\">삭제하기</a>\r\n");
      out.write("\t<!-- \r\n");
      out.write("\t<button onclick=\"location.href='/first/ndelete?no=");
      out.print( notice.getNoticeNo() );
      out.write("'\">삭제</button>\r\n");
      out.write("\t-->\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br><br>\r\n");
      out.write("<p align=\"center\">\r\n");
      out.write("<a href=\"/first/index.jsp\">시작페이지로 이동</a> &nbsp; &nbsp;\r\n");
      out.write("<a href=\"/first/nlist\">목록보기로 이동</a>\r\n");
      out.write("</p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
