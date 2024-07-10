package modules.commons.search.request;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Fields to be inserted
 * @author carlsamson
 *
 */
public class IndexItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String store;
	private String language;
	
	private String name;
	private String description;
	private String image;
	private boolean addToCart = true;
	private String brand;
	private String category;
	private String link;
	private List<Map<String,String>> variants; //[{size:S,color:white},{...}] //flattern
	private List<Map<String,String>> inventory; //[{SKU:ABC,QTY:100,PRICE:20,DISCOUNTED:18},{...}] //flattern

		//List
			//Map
			//variant Map<key,value> -> size:small
	    	//variant Map<key,value> -> color:white
			//Map
	private Map<String, String> attributes; //flattern
	//maximumLength:300
	//minimumLength:50
	private Long id;
	
	private String reviews;

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isAddToCart() {
		return addToCart;
	}

	public void setAddToCart(boolean addToCart) {
		this.addToCart = addToCart;
	}

	public List<Map<String,String>> getVariants() {
		return variants;
	}

	public void setVariants(List<Map<String,String>> variants) {
		this.variants = variants;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	

	public List<Map<String,String>> getInventory() {
		return inventory;
	}

	public void setInventory(List<Map<String,String>> inventory) {
		this.inventory = inventory;
	}


	

}
