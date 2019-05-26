package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="LIEUX")
public class Lieu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idLieu ;
	private String description;
	private String pays;
	private String ville;
	private String quartier;
	private String titre;
	
	@OneToMany(mappedBy="lieu")
	private List<Commentaire> commentairesLieu=new ArrayList<>();

}
