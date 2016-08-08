package com.bitwise.ServletMovieTicket.controller;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;



public class MovieTag extends TagSupport{

	public int doStartTag() throws JspException {
			//PageContext pageContext = (PageContext) getJspContext();
			HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
			HttpServletResponse response = (HttpServletResponse)pageContext.getResponse();
			JspWriter out = pageContext.getOut();
			MoviesInfo mi=(MoviesInfo) request.getSession(false).getAttribute("mo");
			MoviesInfo movieList =(MoviesInfo)request.getSession(false).getAttribute("movieList");
			ArrayList<Movies> list= (ArrayList<Movies>) mi.getList();;
			try {
			out.println("<select id='selectedRecord' name='addedmovies'>");
			for(Movies m : list ){
				out.println("<option value='" + m.getMoviename() + "'>"+m.getMoviename() + "</option>");
			}
			out.println("</select>");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return SKIP_BODY;
	  }
}

