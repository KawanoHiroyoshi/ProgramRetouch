package ec;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.UserBuyDataBeans;
import beans.UserBuyItemDataBeans;
import dao.BuyDetailDAO;

/**
 * 購入履歴画面
 * @author d-yamaguchi
 *
 */
@WebServlet("/UserBuyHistoryDetail")
public class UserBuyHistoryDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			int userId = (int) session.getAttribute("userId");
			String s_id = request.getParameter("buy_id");
			s_id = ("9");


		List<UserBuyDataBeans> ubdb =  BuyDetailDAO.getUserBuyDataBeansListByBuyId(userId);
		List<UserBuyItemDataBeans> ubdb2 =  BuyDetailDAO.getUserBuyItemDataBeansListByBuyId(Integer.parseInt(s_id));

		request.setAttribute("ubdb", ubdb);
		request.setAttribute("ubdb2", ubdb2);
		request.getRequestDispatcher(EcHelper.USER_BUY_HISTORY_DETAIL_PAGE).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("errorMessage", e.toString());
			response.sendRedirect("Error");
		}
	}
	}







