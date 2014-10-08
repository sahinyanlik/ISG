# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table birim (
  birim_id                  integer not null,
  birim_adi                 varchar(255),
  birim_adresi              varchar(255),
  due_date                  timestamp,
  constraint pk_birim primary key (birim_id))
;

create table bolge (
  bolge_id                  integer not null,
  bolge_name                varchar(255),
  constraint pk_bolge primary key (bolge_id))
;

create table sirket (
  id                        integer not null,
  sirket_adi                varchar(255),
  sirket_unvani             varchar(255),
  olusuran_kisi             integer,
  olusturulma_tarihi        timestamp,
  constraint pk_sirket primary key (id))
;

create table user (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_user primary key (email))
;

create sequence birim_seq;

create sequence bolge_seq;

create sequence sirket_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists birim;

drop table if exists bolge;

drop table if exists sirket;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists birim_seq;

drop sequence if exists bolge_seq;

drop sequence if exists sirket_seq;

drop sequence if exists user_seq;

