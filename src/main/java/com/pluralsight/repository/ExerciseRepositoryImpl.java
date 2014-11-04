///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.pluralsight.repository;
//
//import com.pluralsight.model.Exercise;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import org.springframework.stereotype.Repository;
//
///**
// *
// * @author Administrator
// */
//@Repository("exerciseRepository")
//public class ExerciseRepositoryImpl implements ExerciseRepository{
//
//    @PersistenceContext
//    private EntityManager em; 
//    
//    public Exercise save(Exercise exercise) {
//        em.persist(exercise);
//        em.flush();
//        return exercise;
//    }
//    
//}
