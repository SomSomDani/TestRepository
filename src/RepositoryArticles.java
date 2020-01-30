import java.util.List;
public interface RepositoryArticles {
	//	in einem Interface gibt man alle Metoden an die von
	// implementierenden Klassen ausprogrammiert werden müssen
	// Wichtig:	Interfaces geben einen Vertrag vor 
	// es werden nur die Methodenköpfe angegeben es existiert kein Code
	// diesen müssen die implementierenden Klassen bereitstellen
	public boolean Save();
	public boolean Insert(Article article);
	public boolean Remove(int primaryKey);
	public boolean Update(int primaryKey, Article newArtilceData);
	public List<Article> SearchByName(String name);
	public List<Article> SearchByCategory(String category);
	public Article SearchByID(int primaryKey);
	
	
}
