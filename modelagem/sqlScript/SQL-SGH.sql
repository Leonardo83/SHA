CREATE TABLE turnos (
  id SERIAL,
  tipo_turno VARCHAR(10) NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE funcionarios (
  id SERIAL,
  matricula VARCHAR(20) NOT NULL,
  nome VARCHAR(50) NOT NULL,
  sexo CHAR(1) NULL,
  cargo VARCHAR(30) NULL,
  funcao VARCHAR(20) NULL,
  ativo BOOL NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE perfis (
  id SERIAL,
  tipo_perfil VARCHAR(50) NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE disciplinas (
  id SERIAL,
  nome VARCHAR(50) NOT NULL,
  sigla VARCHAR(10) NOT NULL,
  carga_horaria INTEGER NULL,
  PRIMARY KEY(id)
);

CREATE TABLE telefones (
  id SERIAL,
  funcionario_id INTEGER NOT NULL,
  ddd VARCHAR(2) NOT NULL,
  numero VARCHAR(9) NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(funcionario_id)
    REFERENCES funcionarios(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE professores (
  id SERIAL,
  funcionario_id INTEGER NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(funcionario_id)
    REFERENCES funcionarios(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE cursos (
  id SERIAL,
  professor_id INTEGER NOT NULL,
  codigo VARCHAR(10) NOT NULL,
  nome VARCHAR(50) NOT NULL,
  sigla VARCHAR(10) NOT NULL,
  carga_horaria INTEGER NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(professor_id)
    REFERENCES professores(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE restricoes (
  id SERIAL,
  turno_id INTEGER NOT NULL,
  professor_id INTEGER NOT NULL,
  diaDaSemana VARCHAR(20) NOT NULL,
  tempo1 BOOL NOT NULL,
  tempo2 BOOL NOT NULL,
  tempo3 BOOL NOT NULL,
  tempo4 BOOL NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(professor_id)
    REFERENCES professores(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(turno_id)
    REFERENCES turnos(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE usuarios (
  id SERIAL,
  perfil_id INTEGER NOT NULL,
  funcionario_id INTEGER NOT NULL,
  usuario VARCHAR(20) NOT NULL,
  senha VARCHAR(32) NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(funcionario_id)
    REFERENCES funcionarios(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(perfil_id)
    REFERENCES perfis(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE professor_disciplina (
  id SERIAL,
  disciplina_id INTEGER NOT NULL,
  professor_id INTEGER NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(professor_id)
    REFERENCES professores(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(disciplina_id)
    REFERENCES disciplinas(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE modulos (
  id SERIAL,
  curso_id INTEGER NOT NULL,
  nome CHAR(2) NOT NULL,
  cargaHorariaModulo INTEGER NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(curso_id)
    REFERENCES cursos(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE disciplinas_em_modulo (
  id SERIAL,
  modulo_id INTEGER NOT NULL,
  disciplina_id INTEGER NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(disciplina_id)
    REFERENCES disciplinas(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(modulo_id)
    REFERENCES modulos(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE turmas (
  id SERIAL,
  curso_id INTEGER NOT NULL,
  turno_id INTEGER NOT NULL,
  modulo_id INTEGER NOT NULL,
  codigo VARCHAR(10) NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(turno_id)
    REFERENCES turnos(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(curso_id)
    REFERENCES cursos(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(modulo_id)
    REFERENCES modulos(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE grades_horarias (
  id SERIAL,
  turma_id INTEGER NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(turma_id)
    REFERENCES turmas(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE horarios_dia (
  id SERIAL,
  grade_horaria_id INTEGER NOT NULL,
  dia_da_semana VARCHAR(20) NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(grade_horaria_id)
    REFERENCES grades_horarias(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE professor_grade_horaria (
  id SERIAL,
  professor_id INTEGER NOT NULL,
  grade_horaria_id INTEGER NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(grade_horaria_id)
    REFERENCES grades_horarias(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(professor_id)
    REFERENCES professores(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE disciplinas_horarios_dia (
  id SERIAL,
  disciplina_id INTEGER NOT NULL,
  horario_dia_id INTEGER NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(horario_dia_id)
    REFERENCES horarios_dia(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(disciplina_id)
    REFERENCES disciplinas(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE modulos_em_grade (
  id SERIAL,
  modulo_id INTEGER NOT NULL,
  grade_horaria_id INTEGER NOT NULL,
  diaSemana VARCHAR(20) NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(grade_horaria_id)
    REFERENCES grades_horarias(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(modulo_id)
    REFERENCES modulos(id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);


