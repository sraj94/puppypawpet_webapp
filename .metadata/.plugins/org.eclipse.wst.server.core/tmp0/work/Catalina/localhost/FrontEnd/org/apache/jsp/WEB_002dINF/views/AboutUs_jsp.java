/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-04-16 06:37:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/resources/css/pageLayout.css", Long.valueOf(1523860654012L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Pet Shop</title>\r\n");
      out.write("<style> \r\n");
      out.write("  ");
      out.write("@CHARSET \"ISO-8859-1\";\r\n");
      out.write("\r\n");
      out.write(".contentSection{\r\n");
      out.write("width:100vw;\r\n");
      out.write("height:80vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".headerSection{\r\n");
      out.write("width:100vw;\r\n");
      out.write("height:10vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footerSection{\r\n");
      out.write("width:100vw;\r\n");
      out.write("height:5vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"headerSection\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"contentSection\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t<h1>About Us</h1>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\r\n");
      out.write("\t\t\tAt Friendly Pets we understand that your pet is a part of the family,\r\n");
      out.write("\t\t\tbecause we are pet parents too. At our stores you will find a great\r\n");
      out.write("\t\t\tselection of pet food, treats, toys and accessories, all at\r\n");
      out.write("\t\t\tcompetitive prices. You will find our stores in local communities\r\n");
      out.write("\t\t\tacross the Northeast and Midwest United States and Canada. In our\r\n");
      out.write("\t\t\tstores, you will find friendly Pet Experts trained in pet care and we\r\n");
      out.write("\t\t\tpride ourselves on being Pet Experts and we want to use our knowledge\r\n");
      out.write("\t\t\tand experience to help you find the right nutrition and other\r\n");
      out.write("\t\t\tsolutions for your pets. The Friendly Pets family of stores includes\r\n");
      out.write("\t\t\tall the accessories to care of the pet. Together we are the largest\r\n");
      out.write("\t\t\tin India dedicated to providing families with food and supplies for\r\n");
      out.write("\t\t\tdogs, cats, wild birds, fish. In our pet-friendly stores you will\r\n");
      out.write("\t\t\tfind over 7,000 products, including holistic and premium brands of\r\n");
      out.write("\t\t\tpet foods and treats, as well as a wide selection of essential and\r\n");
      out.write("\t\t\tinnovative pet supplies to suit every budget. Many of our stores have\r\n");
      out.write("\t\t\tself-serve pet washing stations complete with a variety of shampoos,\r\n");
      out.write("\t\t\ttowels, dryers, and aprons and feature easy-to-use stairs and\r\n");
      out.write("\t\t\televated tubs. And we clean up the mess for you afterward. Our\r\n");
      out.write("\t\t\tphilosophy is to provide pet owners with the best selection of pet\r\n");
      out.write("\t\t\tcare items at competitive prices, together with friendly customer\r\n");
      out.write("\t\t\tservice from our team of Pet Experts, at convenient, neighborhood\r\n");
      out.write("\t\t\tstore locations. All of our stores are dedicated to helping local\r\n");
      out.write("\t\t\tpets in need, and we partner with local shelters, rescues and\r\n");
      out.write("\t\t\tcharities for adoption events, in-store adoptions (select stores\r\n");
      out.write("\t\t\tonly) and pet donation bin programs, as well as through our national\r\n");
      out.write("\t\t\tdonation drives and fundraising campaigns for these groups. <br>\r\n");
      out.write("\t\t\t<span style=\"align-text: center\">At Friendly Pets , we are Pet\r\n");
      out.write("\t\t\t\tExperts, and we are pet lovers, too.</span>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"footerSection\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
