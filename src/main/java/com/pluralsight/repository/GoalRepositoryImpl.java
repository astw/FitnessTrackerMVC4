//package com.pluralsight.repository;
//
//import org.springframework.stereotype.Repository;
//
//import com.pluralsight.model.Goal;
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//@Repository("goalRepository")
//public class GoalRepositoryImpl implements GoalRepository {
//
//        @PersistenceContext
//        private EntityManager em; 
//        
//	public Goal save(Goal goal) {
//            if(goal.getId() > 0){
//	 	em.persist(goal);
//                em.flush();
//            }
//            else
//            { 
//                goal = em.merge(goal); // for update
//            }
//		return goal;
//	}
//
//    public List<Goal> loadAll() {
//        Query query = em.createQuery("select g from Goal g");
//        List goals = query.getResultList();
//        return goals;
//    }
//
//}
