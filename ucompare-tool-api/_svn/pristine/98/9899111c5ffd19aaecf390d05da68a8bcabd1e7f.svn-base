IF OBJECT_ID('uc_request') IS NOT NULL DROP TABLE uc_request
go

CREATE TABLE uc_request(
    id                             NUMERIC(30) 		identity,
    email                          VARCHAR(100)    NOT NULL,
    status                         VARCHAR(25)     NOT NULL, -- complete, fail
    svn_url_1                      VARCHAR(500)    NOT NULL,
    svn_url_2                      VARCHAR(500)    NOT NULL,
    created_by                     VARCHAR(20)     NOT NULL,
    created_date                   DATETIME        NOT NULL,
    updated_by                     VARCHAR(20)     NOT NULL,
    updated_date                   DATETIME        NOT NULL,
    CONSTRAINT uc_request_pk PRIMARY KEY (id)
)
lock datapages
go
GRANT ALL on uc_request to wrapfp_grp
go
GRANT SELECT on uc_request to select_all
go
GRANT SELECT on uc_request to sdbatch_grp
go

IF OBJECT_ID('uc_request_output') IS NOT NULL DROP TABLE uc_request_output
go

CREATE TABLE uc_request(
    id                             NUMERIC(30) 		identity,
    ucRequest_Id                   VARCHAR(100)    NOT NULL,
    status                         VARCHAR(25)     NOT NULL, -- complete, fail
    svn_url_1                      VARCHAR(500)    NOT NULL,
    svn_url_2                      VARCHAR(500)    NOT NULL,
    created_by                     VARCHAR(20)     NOT NULL,
    created_date                   DATETIME        NOT NULL,
    updated_by                     VARCHAR(20)     NOT NULL,
    updated_date                   DATETIME        NOT NULL,
    CONSTRAINT uc_request_pk PRIMARY KEY (id)
)
lock datapages
go
GRANT ALL on uc_request to wrapfp_grp
go
GRANT SELECT on uc_request to select_all
go
GRANT SELECT on uc_request to sdbatch_grp
go


----------------------------------------------------------------------------------------
IF OBJECT_ID('uc_request_log') IS NOT NULL   DROP TABLE uc_request_log
go
CREATE TABLE uc_request_log (
    id                             NUMERIC(30)     identity,
    uc_request_id                  VARCHAR(100)    NOT NULL,
    status			   			   VARCHAR(25)     NOT NULL,
	log							   VARCHAR(1000)     NOT NULL, 
    created_by                     VARCHAR(20)     NOT NULL,
    created_date                   DATETIME        NOT NULL,
    updated_by                     VARCHAR(20)     NOT NULL,
    updated_date                   DATETIME        NOT NULL,
    CONSTRAINT uc_request_log_pk PRIMARY KEY (id)
)
lock datapages
go
GRANT ALL on uc_request_log to wrapfp_grp
go
GRANT SELECT on uc_request_log to select_all
go
GRANT SELECT on uc_request_log to sdbatch_grp
go

----------------------------------------------------------------------------------------
IF OBJECT_ID('uc_request_url') IS NOT NULL   DROP TABLE uc_request_url
go
CREATE TABLE uc_request_url(
    id                             NUMERIC(30)     identity,
    uc_request_id                  NUMERIC(30)     NOT NULL,
    url                            VARCHAR(1000)   NOT NULL,
    seq                            NUMERIC(2)     NOT NULL,
    created_by                     VARCHAR(20)     NOT NULL,
    created_date                   DATETIME        NOT NULL,
    updated_by                     VARCHAR(20)     NOT NULL,
    updated_date                   DATETIME        NOT NULL,
    CONSTRAINT uc_request_url_pk PRIMARY KEY (id)
)
lock datapages
go
GRANT ALL on uc_request_url to wrapfp_grp
go
GRANT SELECT on uc_request_url to select_all
go
GRANT SELECT on uc_request_url to sdbatch_grp
go

