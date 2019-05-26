package entities;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idUser ;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private String adress;
	private String role;
	
	@OneToMany(mappedBy="user")
	private List<Commentaire> commentairesUser=new ArrayList<>();
	
}
