//package com.doctors.doctors;
//class PNode{
//    Doctors doctors;
//    PNode next,pre;
//
//    public PNode(){
//
//    }
//    public PNode(Doctors doctors){
//        this.doctors=doctors;
//        next=null;
//        pre=null;
//
//    }
//}
//public class DoctorsList {
//
//    PNode head,tail;
//
//    public DoctorsList(){
//        head=null;
//        tail=null;
//    }
//
//    public  void Insert(Doctors doctors){
//        PNode node=new PNode(doctors);
//
//        if(head==null || tail==null){
//            head=node;
//            tail=node;
//        }
//        else {
//            head.next=node;
//            node.pre=head;
//            head=node;
//        }
//    }
//
//
//    public Doctors searchById(String id){
//        PNode temp=head;
//        while (temp!=null){
//            if(temp.doctors.getId().equals(id))
//            {
//                return temp.doctors;
//            }
//            temp=temp.pre;
//        }
//        return null;
//    }
//
//    public Doctors searchByContact(String contact){
//        PNode temp=head;
//        while (temp!=null){
//            if(temp.doctors.getContact().equals(contact))
//            {
//                return temp.doctors;
//            }
//            temp=temp.pre;
//        }
//        return null;
//    }
//}
