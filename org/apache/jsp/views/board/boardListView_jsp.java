/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.48
 * Generated at: 2018-02-21 04:06:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.Board;
import java.util.ArrayList;
import java.sql.Date;
import member.model.vo.Member;
import java.util.*;

public final class boardListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/../../footer.html", Long.valueOf(1519167885462L));
    _jspx_dependants.put("/views/board/../../header.jsp", Long.valueOf(1501231460000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("board.model.vo.Board");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.sql.Date");
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
      			"boardError.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");

	ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list");
	int listCount = ((Integer)request.getAttribute("listCount")).intValue();
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
	int startPage = ((Integer)request.getAttribute("startPage")).intValue();
	int endPage = ((Integer)request.getAttribute("endPage")).intValue();
	int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>boardListView</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction showInsertForm(){\r\n");
      out.write("\t\tlocation.href = \"views/board/boardInsertForm.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("    \r\n");
      out.write("<!-- html comment tag -->\r\n");

	Member member = (Member)session.getAttribute("member");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>first</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.login { float : right; }\r\n");
      out.write("\tul li a {\r\n");
      out.write("\t\tdisplay : block;\r\n");
      out.write("\t\twidth : 120px;\r\n");
      out.write("\t\theight : 35px;\r\n");
      out.write("\t\tbackground : orange;\r\n");
      out.write("\t\tpadding-top : 5px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tul li a:hover {\r\n");
      out.write("\t\tbackground : olive;\r\n");
      out.write("\t\tcolor : white;\r\n");
      out.write("\t\ttext-shadow : 2px 2px 5px black;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tul li {\r\n");
      out.write("\t\tlist-style : none;\r\n");
      out.write("\t\tfloat : left;\r\n");
      out.write("\t\tmargin-right : 5px;\r\n");
      out.write("\t\tpadding-top : 10px;\r\n");
      out.write("\t\ttext-align : center;\r\n");
      out.write("\t\tfont-size : 16pt;\r\n");
      out.write("\t\tfont-weight : bold;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("<h1>firstWebProject</h1>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<hr>\r\n");

	if(member == null){  //로그인하지 않았다면

      out.write("\r\n");
      out.write("<form action=\"login\" method=\"post\" class=\"login\">\r\n");
      out.write("<table class=\"login\" width=\"250\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"yellow\">\r\n");
      out.write("\t<tr><td>아이디 : </td><td><input type=\"text\" name=\"userid\"></td></tr>\r\n");
      out.write("\t<tr><td>암 호 : </td><td><input type=\"password\" name=\"userpwd\"></td></tr>\r\n");
      out.write("\t<tr><td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t<input type=\"submit\" value=\"로그인\"> &nbsp; &nbsp; \r\n");
      out.write("\t<a href=\"views/member/enroll.html\">회원가입</a>\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("\t<tr><td colspan=\"2\" align=\"center\">아이디/암호가 기억나지 않는다면</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
 }else{ 
      out.write("\r\n");
      out.write("<table class=\"login\" width=\"250\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"yellow\">\r\n");
      out.write("\t<tr><td>");
      out.print( member.getName() );
      out.write(" 님</td>\r\n");
      out.write("\t<td><a href=\"/first/logout\">로그아웃</a></td></tr>\r\n");
      out.write("\t<tr><td></td><td></td></tr>\r\n");
      out.write("\t<tr><td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t<a href=\"/first/views/member/myinfo.jsp\">내 정보보기</a>\t\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("\t<tr><td colspan=\"2\" align=\"center\"></td></tr>\r\n");
      out.write("</table>\r\n");
 } 
      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"/first/nlist\">공지사항</a></li>\r\n");
      out.write("\t\t<li><a href=\"/first/blist\">게시판</a></li>\r\n");
      out.write("\t\t<li><a>etc</a></li>\r\n");
      out.write("\t\t<li><a>etc</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<hr style=\"clear:both;\">\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<h1 align=\"center\">게시글 목록</h1>\r\n");
      out.write("<h3 align=\"center\">총 게시글 갯수 : ");
      out.print( listCount );
      out.write('\r');
      out.write('\n');
 if(member != null){ 
      out.write("\r\n");
      out.write("&nbsp; &nbsp; &nbsp; <button onclick=\"showInsertForm();\">글쓰기</button>\r\n");
  } 
      out.write("</h3>\r\n");
      out.write("<table align=\"center\" border=\"1\" cellspacing=\"0\" width=\"700\">\r\n");
      out.write("<tr><th>번호</th><th>제목</th><th>작성자</th><th>날짜</th>\r\n");
      out.write("<th>조회수</th><th>첨부파일</th></tr>\r\n");

	for(Board b : list){

      out.write("\r\n");
      out.write("<tr><td align=\"center\">");
      out.print( b.getBoardNum() );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.write("\t");
 if(b.getBoardLevel() == 1){  //원글의 답글일 때 
      out.write("\r\n");
      out.write("\t &nbsp; &nbsp; ▶ \r\n");
      out.write("\t");
 }else if(b.getBoardLevel() == 2){ //답글의 답글일 때 
      out.write("\r\n");
      out.write("\t &nbsp; &nbsp; &nbsp; &nbsp; ▶▶ \r\n");
      out.write("\t");
 } 
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(member != null){ 
      out.write("\r\n");
      out.write("\t\t<a href=\"/first/bdetail?bnum=");
      out.print( b.getBoardNum() );
      out.write("&page=");
      out.print( currentPage );
      out.write('"');
      out.write('>');
      out.print( b.getBoardTitle() );
      out.write("</a>\r\n");
      out.write("\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t");
      out.print( b.getBoardTitle() );
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("<td align=\"center\">");
      out.print( b.getBoardWriter() );
      out.write("</td>\r\n");
      out.write("<td align=\"center\">");
      out.print( b.getBoardDate() );
      out.write("</td>\r\n");
      out.write("<td align=\"center\">");
      out.print( b.getBoardReadCount() );
      out.write("</td>\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("\t");
 if(b.getBoardOriginalFileName() != null){  //원글의 답글일 때 
      out.write("\r\n");
      out.write("\t\t ◎\r\n");
      out.write("\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t");
 } 
      out.write("\t \r\n");
      out.write("</td></tr>\r\n");
  } //for close  
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<tr align=\"center\" height=\"20\">\r\n");
      out.write("<td colspan=\"6\">\r\n");
      out.write("\t");
  if(currentPage <= 1){	
      out.write("\r\n");
      out.write("\t\t[이전] &nbsp;\r\n");
      out.write("\t");
  }else{ 
      out.write("\r\n");
      out.write("\t\t<a href=\"/first/blist?page=");
      out.print( currentPage - 1 );
      out.write("\">[이전]</a> &nbsp;\r\n");
      out.write("\t");
  } 
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write('\r');
      out.write('\n');
      out.write('	');
  for(int p = startPage; p <= endPage; p++){ 
			if(p == currentPage){
	
      out.write("<font color=\"red\" size=\"4\"><b>[");
      out.print( p );
      out.write("]</b></font>\r\n");
      out.write("\t");
     }else{ 
      out.write("\r\n");
      out.write("\t\t<a href=\"/first/blist?page=");
      out.print( p );
      out.write('"');
      out.write('>');
      out.print( p );
      out.write("</a>\r\n");
      out.write("\t");
  }} //else and for close 
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(currentPage >= maxPage){ 
      out.write("\r\n");
      out.write("\t\t[다음]\r\n");
      out.write("\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t<a href=\"/first/blist?page=");
      out.print( currentPage + 1 );
      out.write("\">[다음]</a>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br><br>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<hr style=\"border:dashed 3px blue;\">\r\n");
      out.write("<div style=\"text-align:center;color:gray;\">\r\n");
      out.write("copyright@kh.org 2017. 7. 24<br>\r\n");
      out.write("web service test first project\r\n");
      out.write("</div>");
      out.write("\r\n");
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
