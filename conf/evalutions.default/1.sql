CREATE TABLE "Portfolio"(
    "id" SERIAL NOT NULL PRIMARY KEY,
    "photo" VARCHAR NULL,
    "project_name" VARCHAR NOT NULL,
	  "using_technology" VARCHAR NULL,
	  "about_project" VARCHAR NULL,
	  "created_date" VARCHAR NULL,
	  "last_updated_date" VARCHAR NULL
);