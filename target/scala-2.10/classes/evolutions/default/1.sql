# --- First database schema

# --- !Ups

create table jogador (
  id                        bigint not null,
  name                      varchar(255),
  caminho                   varchar(255),
  constraint pk_jogador primary key (id))
;

create table posicoes (
  id                        bigint not null,
  name                      varchar(255),
  jogador_id                bigint,
  constraint pk_posicoes primary key (id))
;

create sequence jogadores_seq start with 1000;

create sequence posicoes_seq start with 1000;

alter table posicoes add constraint fk_posicoes_jogador_1 foreign key (jogador_id) references jogador (id) on delete restrict on update restrict;
create index ix_posicoes_jogador_1 on posicoes (jogador_id);


# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists jogador;

drop table if exists posicoes;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists jogador_seq;

drop sequence if exists posicoes_seq;

