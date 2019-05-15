package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.ILotissementRemote;
import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

	@Named
	@SessionScoped
	public class LotissementBean implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		// Attributs
		@EJB
		private ILotissementRemote service;
		private Lotissement lotissement= new Lotissement();
		private List<Lotissement> lotissements;
		public ILotissementRemote getService() {
			return service;
		}
		public void setService(ILotissementRemote service) {
			this.service = service;
		}
		public Lotissement getLotissement() {
			return lotissement;
		}
		public void setLotissement(Lotissement lotissement) {
			this.lotissement = lotissement;
		}
		public List<Lotissement> getLotissements() {
			return lotissements;
		}
		public void setLotissements(List<Lotissement> lotissements) {
			this.lotissements = lotissements;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		

		// Méthodes
		
		public void ajouterPersonne(Personne p) {
			service.ajouterPersonne(p);
		}
		public List<Personne> findAllPersonne() {
			return service.findAllPersonne();
		}
		public void modifierPersonne(Personne p) {
			service.modifierPersonne(p);
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
		
		
		
		public void ajouterLotissement(Lotissement l) {
			service.ajouterLotissement(l);
		}
		public List<Lotissement> findAllLotissement() {
			return service.findAllLotissement();
		}
		public void modifierLotissement(Lotissement l) {
			service.modifierLotissement(l);
		}
		public void supprimerLotissement(Lotissement l) {
			service.supprimerLotissement(l);
		}
		public Lotissement getLotissement(Long idLot) {
			return service.getLotissement(idLot);
		}
		public Lotissement affichageLotissement(Long idLot) {
			return service.affichageLotissement(idLot);
		}
		
		
		
		public void acheterLotissement(Personne p, Lotissement l) {
			service.acheterLotissement(p, l);
		}
		public void seMarier (Personne p1, Personne p2) {
			service.seMarier(p1, p2);
		}
}
