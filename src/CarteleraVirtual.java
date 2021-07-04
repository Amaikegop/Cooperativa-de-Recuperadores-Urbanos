import java.util.*;

public class CarteleraVirtual {
	
    private List<Post> listPost;
	
	public CarteleraVirtual() {
		this.listPost = new ArrayList<Post>();
	}

	public Post getPost(Ciudadano ciudadano){
		for(Post post : listPost)
			if(post.getPostulante().equals(ciudadano))
				return post;
		return null;
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

	@Override
	public String toString() {
		for(Post post : listPost)
			System.out.println(post.toString() + " ");
		return " ";
	}
    
    

}
