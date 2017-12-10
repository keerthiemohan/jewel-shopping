package frontend.ere.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import frontend.ere.shoppingbackend.dao.CategoryDAO;
import frontend.ere.shoppingbackend.dto.Category;	

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories=new ArrayList<>();
	
	
	static {
		 Category category=new Category();
		 
		 // adding first category
		 category.setId(1);
		 category.setName("Earring");
		 category.setDescription("This is some description on earrings!");
		 category.setImageURL("cat_1.png");
		 
		 
		 categories.add(category);
		  
		 //second category
		 category.setId(2);
		 category.setName("Ring");
		 category.setDescription("This is some description on rings!");
		 category.setImageURL("cat_2.png");
		 
		 categories.add(category);
		 
		//third category
		 category.setId(3);
		 category.setName("Chain");
		 category.setDescription("This is some description on chains!");
		 category.setImageURL("cat_3.png");
		 
		 categories.add(category);
		 
		 	 
	}
	
	
	
	
	

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
