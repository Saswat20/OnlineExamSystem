
package com.exam.controller;
import com.exam.dao.ExamDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {
 protected void doPost(HttpServletRequest r,HttpServletResponse s)
 throws ServletException,IOException {
  try {
   if(new ExamDAO().login(r.getParameter("username"),
   r.getParameter("password"))){
    r.getSession().setAttribute("user","student");
    s.sendRedirect("dashboard.jsp");
   } else {
    s.sendRedirect("index.jsp");
   }
  } catch(Exception e){e.printStackTrace();}
 }
}
