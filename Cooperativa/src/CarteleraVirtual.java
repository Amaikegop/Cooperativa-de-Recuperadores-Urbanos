import java.util.*;

public class CarteleraVirtual {
	
    private List<Post> listPost;
	
	public CarteleraVirtual() {
		this.listPost = new ArrayList<Post>();
	}

	public Post getPost(Ciudadano ciudadano){
    	Post aux = new Post(ciudadano.getNombre(), ciudadano);
    	return aux;
    }
    
    public void removerPost(Post post) {
    	listPost.remove(post);
    }
    
    public void addPost(Post post) {
    	listPost.add(post);
    }
	
    public List<Post> getListPost(){
    	List<Post> aux = new ArrayList<Post>(listPost);
    	return aux;
    }

}
