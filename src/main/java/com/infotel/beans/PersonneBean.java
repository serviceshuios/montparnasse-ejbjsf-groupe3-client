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
		// Méthodes
		
		public void ajouterPersonne() {
			service.ajouterPersonne(personne);
		}
		public List<Personne> findAllPersonne() {
			return service.findAllPersonne();
		}
		public void modifierPersonne() {
			service.modifierPersonne(personne);
		}
		public void supprimerPersonne(Personne p) {
			service.supprimerPersonne(p);
		}
		public Personne getPersonne(Long idPersonne) {
			return service.getPersonne(idPersonne);
		}
		public Personne affichagePersonne(Long idPersonne) {
			return service.affichagePersonne(idPersonne);
		}
		
		
		
		public void acheterLotissement(Personne p, Lotissement l) {
			service.acheterLotissement(p, l);
		}
		public void seMarier (Personne p1, Personne p2) {
			service.seMarier(p1, p2);
		}
		
	}

