import java.util.List;

public class RepositoryArticleDB implements RepositoryArticles{

	// Implementiert eine Klasse ein Interface, so verpflichtet sie sich dazu,
	// dass sie alle Methoden ausprogrammiert
	// Wichtig: es können beliebig viele weitere Members (Felder, Methoden) vorhanden sein
	
	@Override
	public boolean Save() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Insert(Article article) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Remove(int primaryKey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(int primaryKey, Article newArtilceData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Article> SearchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> SearchByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article SearchByID(int primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
