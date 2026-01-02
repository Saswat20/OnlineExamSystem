
package com.exam.controller;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SubmitExamServlet extends HttpServlet {
 protected void doPost(HttpServletRequest r,HttpServletResponse s)
 throws ServletException,IOException {
  int score=0;
  if("Language".equals(r.getParameter("q1"))) score++;
  r.setAttribute("score",score);
  r.getRequestDispatcher("result.jsp").forward(r,s);
 }
}
