package sec03.brd01;

import java.util.List;

public class BoardService {
	
	BoardDAO boardDAO;
	
	public BoardService() {
		boardDAO = new BoardDAO();
	}
	
	
	List<ArticleVO> listArticles(){
		List<ArticleVO>  articlesList= boardDAO.selectAllArticles();
		return articlesList;
	};
	
	
	public int addArticle(ArticleVO article){
		int articleNO=boardDAO.insertNewArticle(article);
		return articleNO;
	}
	
	
	
	public ArticleVO viewArticle(int articleNo){
		ArticleVO article = null;
		article=boardDAO.selectArticle(articleNo);
		return article;
	}
	
	
	
	
	public void modArticle(ArticleVO article){
		boardDAO.updateArticle(article);
	}
	
	public List<Integer> removeArticle(int articleNo){
		List<Integer> articleNOList= boardDAO.selectRemovedArticles(articleNo); //articleNOList는 글번호가 2번일 경우 2(부모) 자식 3,5,6
		boardDAO.deleteArticle(articleNo);
		return articleNOList;
	}
	
	

}
