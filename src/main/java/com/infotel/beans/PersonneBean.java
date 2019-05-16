package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IPersonneRemote;
import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

	@Named
	@SessionScoped
	public class PersonneBean implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		// Attributs
		@EJB
		private IPersonneRemote service;
		private Personne personne= new Personne();
		private Personne personne2= new Personne();
		private List<Personne> personnes;
		
		
		public IPersonneRemote getService() {
			return service;
		}
		public void setService(IPersonneRemote service) {
			this.service = service;
		}
		public Personne getPersonne() {
			return personne;
		}
		public void setPersonne(Personne personne) {
			this.personne = personne;
		}
		public List<Personne> getPersonnes() {
			return personnes;
		}
		public void setPersonnes(List<Personne> personnes) {
			this.personnes = personnes;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Personne getPersonne2() {
			return personne2;
		}
		public void setPersonne2(Personne personne2) {
			this.personne2 = personne2;
		}
		
		// Méthodes
		
		
		public void ajouterPersonne() {
			service.ajouterPersonne(personne);
			personne = new Personne();
		}
		public List<Personne> findAllPersonne() {
			return service.findAllPersonne();
		}
		public void modifierPersonne() {
			service.modifierPersonne(personne);
			personne = new Personne();
		}
		public void supprimerPersonne(Long idPersonne) {
			service.supprimerPersonne(idPersonne);
		}
		public Personne getPersonne(Long idPersonne) {
			return service.getPersonne(idPersonne);
		}
		public Personne affichagePersonne(Long idPersonne) {
			return service.affichagePersonne(idPersonne);
		}
		
			
		public void seMarier () {
			service.seMarier(personne.getIdPersonne(), personne2.getIdPersonne());
			service.seMarier(personne2.getIdPersonne(), personne.getIdPersonne());
		}
		
		
	}

