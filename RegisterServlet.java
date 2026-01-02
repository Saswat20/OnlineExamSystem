
package com.exam.controller;
import com.exam.dao.ExamDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RegisterServlet extends HttpServlet {
 protected void doPost(HttpServletRequest r,HttpServletResponse s)
 throws ServletException,IOException {
  try {
   new ExamDAO().register(r.getParameter("username"),
   r.getParameter("password"));
   s.sendRedirect("index.jsp");
  } catch(Exception e){e.printStackTrace();}
 }
}
