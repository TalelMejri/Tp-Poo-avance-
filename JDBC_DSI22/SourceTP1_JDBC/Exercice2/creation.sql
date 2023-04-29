CREATE TABLE dept (	nodept numeric(2) NOT NULL,
			nom VARCHAR(25),
			noregion NUMERIC(1) NOT NULL,
			CONSTRAINT dept_nodept_pk PRIMARY KEY (nodept)
			);



CREATE TABLE emp (	noemp NUMERIC(7) NOT NULL ,
			nom VARCHAR(25) ,
			prenom VARCHAR(25) ,
			embauche DATE,
			nosupr NUMERIC(7) ,
			titre VARCHAR(25) ,
			nodept NUMERIC(2) NOT NULL ,
			salaire NUMERIC(11, 2) ,
			x_commission NUMERIC(4, 2),
			CONSTRAINT emp_nodept_fk FOREIGN KEY (nodept) REFERENCES dept(nodept),
			CONSTRAINT emp_noemp_pk PRIMARY KEY (noemp),
			CONSTRAINT emp_tx_commission_ck 
			CHECK (tx_commission BETWEEN 10 AND 20)
			);