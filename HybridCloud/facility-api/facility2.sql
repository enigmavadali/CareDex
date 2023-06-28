--
-- PostgreSQL database dump
--

-- Dumped from database version 14.5
-- Dumped by pg_dump version 14.4

-- Started on 2023-04-24 22:26:42 PDT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3577 (class 1262 OID 19432)
-- Name: Facility2; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "Facility2" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'en_US.UTF-8';


ALTER DATABASE "Facility2" OWNER TO postgres;

\connect "Facility2"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 209 (class 1259 OID 19434)
-- Name: resident; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.resident (
    pid integer NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    room integer,
    gender character varying(50),
    age integer,
    dob date,
    telephone character varying(50),
    haspet character varying(50),
    weight_lbs integer,
    photo character varying(500),
    emmergencycontact1 character varying(50),
    telephone_emc1 character varying(50),
    relationship_emc1 character varying(15),
    emmergencycontact2 character varying(50),
    telephone_emc2 character varying(50),
    relationship_emc2 character varying(15),
    isambulatory character varying(50),
    isabletocommunicate character varying(50),
    medicalinformation character varying(250),
    isvacinnatedforcovid19 character varying(50),
    lastfall date,
    lastervisit date,
    dischargedfromovernighthospitalstay character varying(50),
    isfallrisk character varying(50),
    iswanderrisk character varying(50),
    iselopementrisk character varying(50),
    physician character varying(50),
    physician_telephone character varying(50),
    ispet text
);


ALTER TABLE public.resident OWNER TO postgres;

--
-- TOC entry 3571 (class 0 OID 19434)
-- Dependencies: 209
-- Data for Name: resident; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.resident VALUES (21, 'Morissa', 'Farloe', NULL, 'Female', 88, '1934-10-09', '211-245-9760', 'NO', 132, 'https://robohash.org/fugiatdoloreassumenda.png?size=200x200&set=set1', 'Zara Collins', '405-405-9278', 'grand-daughter', 'Emma Jenkins', '794-875-3380', 'grand-daughter', 'YES', 'YES', 'Diabetic, Congestive Heart Disease, Covid +', 'YES', '2021-09-08', '2021-04-04', 'NO', 'NO', 'NO', 'NO', 'Dr. Donna McKline', '212-877-4174', NULL);
INSERT INTO public.resident VALUES (23, 'Glenda', 'Harburtson', NULL, 'Female', 60, '1962-12-26', '515-558-0142', 'NO', 131, 'https://robohash.org/etfacereet.png?size=200x200&set=set1', 'Jean Cooper', '912-551-1873', 'daughter', 'Ryan Cooper', '515-674-9834', 'son', 'YES', 'YES', 'Daughter of Tracey ', 'YES', '2021-01-07', '2021-01-24', 'NO', 'NO', 'NO', 'NO', 'Dr. Shelley Glason', '951-894-8586', NULL);
INSERT INTO public.resident VALUES (24, 'Tracy', 'Andrivel', NULL, 'Female', 82, '1940-03-17', '336-118-2324', 'NO', 130, 'https://robohash.org/voluptasdoloribusvel.png?size=200x200&set=set1', 'Tessa Kelly', '401-216-0873', 'grand-daughter', 'Andrew Perkins', '411-623-5572', 'grand-daughter', 'YES', 'YES', 'Hypertension, Type 2 diabetes, osteoarthritis, Hearing Aids ', 'YES', NULL, '2022-01-18', 'YES', 'YES', 'NO', 'NO', 'Dr. Kessie Cusick', '412-457-1769', NULL);
INSERT INTO public.resident VALUES (25, 'Lucius', 'Reihill', NULL, 'Male ', 96, '1952-02-16', '157-518-4702', 'NO', 190, 'https://robohash.org/numquamtemporibusamet.png?size=200x200&set=set1', 'Jaylin Freeman', '764-808-5685', 'grand-son', 'Brian Rodriguez', '592-284-0061', 'grand-son', 'YES', 'YES', 'Hypertension, hearing aids, eyeglasses, Panic Attack', 'YES', '2022-01-04', '2021-04-04', 'YES', 'NO', 'NO', 'NO', 'Dr. Hal Karpman', '603-390-5135', NULL);
INSERT INTO public.resident VALUES (26, 'Sal', 'Follan', NULL, 'Female', 85, '1937-01-18', '670-611-4347', 'NO', 126, 'https://robohash.org/etipsaquia.png?size=200x200&set=set1', 'Jewel Watkins', '141-940-0523', 'son', 'Ruth Biggs', '406-689-7000', 'grand-daughter', 'YES', 'NO', 'HTN, COPD, Dementia', 'YES', '2021-06-07', '2021-11-10', 'YES', 'YES', 'YES', 'YES', 'Dr. Mufi Verzey', '212-877-6153', NULL);
INSERT INTO public.resident VALUES (27, 'Tootsie', 'Halden', NULL, 'Female', 98, '1924-10-05', '138-544-5996', 'NO', 112, 'https://robohash.org/eaetprovident.png?size=200x200&set=set1', 'Blake Odonnell', '168-410-3882', 'daughter', 'Margaret Rivera', '829-409-8152', 'son-in-law', 'YES', 'YES', 'Osteoarthritis, Prior Stroke ', 'YES', '2021-05-07', NULL, 'NO', 'NO', 'NO', 'NO', 'Dr. Maddy Ackerley', '216-520-7487', NULL);
INSERT INTO public.resident VALUES (15, 'Rick', 'Truin', NULL, 'Male', 79, '1943-04-03', '706-765-7464', 'NO', 107, 'https://robohash.org/infacerevoluptatum.png?size=200x200&set=set1', 'Alexis Alvarez', '977-851-0773', 'grand-daughter', 'Ken Bradley', '271-632-4943', 'son', 'YES', 'YES', 'Visual Impariment requiring glasses, HTN, DM', 'YES', '2022-01-11', '2021-11-10', 'YES', 'NO', 'NO', 'NO', 'Dr. Maggie Ritchings', '612-217-5880', NULL);
INSERT INTO public.resident VALUES (28, 'Melony', 'Summerlad', NULL, 'Female', 75, '1947-07-13', '797-356-0427', 'NO', 137, 'https://robohash.org/sedaliquidnon.png?size=200x200&set=set1', 'Thaddeus Huang', '959-808-3264', 'daughter-in-law', 'Jason Watson', '117-788-3730', 'daughter', 'YES', 'YES', 'Panic Attacks,  Depression, Hypertension', 'YES', '2022-01-12', '2021-11-08', 'NO', 'YES', 'NO', 'NO', 'Dr. Shandie Rodman', '662-318-5396', NULL);
INSERT INTO public.resident VALUES (29, 'Lanae', 'Wrennall', NULL, 'Female', 88, '1934-12-24', '377-462-7930', 'NO', 110, 'https://robohash.org/autemquisquamdolorem.png?size=200x200&set=set1', 'Tessa Kelly', '815-598-4931', 'son-in-law', 'Elizabeth Griffiths', '383-187-4736', 'daughter', 'YES', 'YES', 'Diabetes, prior stroke ', 'YES', '2021-11-16', '2021-06-03', 'NO', 'NO', 'NO', 'NO', 'Dr. Cory White', '612-217-6581', NULL);
INSERT INTO public.resident VALUES (30, 'Rosalinda', 'Hindge', NULL, 'Female', 92, '1930-03-15', '153-950-4850', 'NO', 131, 'https://robohash.org/officiissedet.png?size=200x200&set=set1', 'Salvador Kidd', '609-630-9061', 'daughter', 'Ronald Taylor', '744-677-0518', 'daughter', 'YES', 'YES', 'Hypertension, asthmatic', 'YES', NULL, '2021-12-08', 'YES', 'NO', 'NO', 'NO', 'Dr. Ella Bridley', '954-963-9253', NULL);
INSERT INTO public.resident VALUES (31, 'Karole', 'Embleton', NULL, 'Female', 79, '1943-09-03', '403-604-2633', 'NO', 115, 'https://robohash.org/repudiandaeremmagni.png?size=200x200&set=set1', 'Alexis Alvarez', '603-319-5285', 'son-in-law', 'Kenny Johnson', '172-494-0259', 'daughter', 'YES', 'YES', 'Osteoarthritis, Arthritis, Previous breast cancer', 'YES', NULL, '2021-10-20', 'YES', 'NO', 'NO', 'NO', 'Dr. Prisca Grindle', '612-217-3632', NULL);
INSERT INTO public.resident VALUES (17, 'Mona', 'Lisa', NULL, 'Female', 69, '1953-08-15', '153-950-4850', 'YES', 141, 'https://robohash.org/officiissedet.png?size=200x200&set=set1', 'Salvador Kidd', '609-630-9061', 'daughter', 'Ronald Taylor', '744-677-0518', 'daughter', 'YES', 'YES', 'Visual Impariment, HTN, DM', 'YES', NULL, '2021-12-08', 'YES', 'YES', 'NO', 'NO', 'Dr. Ella Bridley', '954-963-9253', NULL);
INSERT INTO public.resident VALUES (13, 'Dorian', 'Medendorp', NULL, 'Male', 75, '1947-02-01', '667-492-8985', 'NO', 169, 'https://robohash.org/velitfacereest.png?size=200x200&set=set1', 'Zara Collins', '562-371-9738', 'grand-son', 'Sandy Gomez', '292-857-0298', 'grand-son', 'YES', 'YES', 'Hypertension, hyperlipidemia, osteoarthritus ', 'YES', NULL, '2021-11-18', 'YES', 'YES', 'NO', 'NO', 'Dr. Issiah Dalbey', '612-217-6222', NULL);
-- INSERT INTO public.resident VALUES (32, 'Magnum', 'PI', NULL, 'Male', NULL, NULL, '153-950-4850', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'SERVICE DOG', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'YES');
INSERT INTO public.resident VALUES (11, 'Hank', 'Dahlback', NULL, 'Male', 81, '1941-03-27', '832-298-8043', 'NO', 136, 'https://robohash.org/nulladolorexercitationem.png?size=200x200&set=set1', 'Blake Odonnell', '744-584-0591', 'grand-daughter', 'Jeffrey Kim', '140-731-4010', 'daughter-in-law', 'YES', 'YES', 'Hypertension', 'YES', NULL, '2021-05-30', 'NO', 'YES', 'NO', 'NO', 'Dr. Trixie Newhouse', '615-536-5792', NULL);

SELECT * FROM public.resident;
--
-- TOC entry 3431 (class 2606 OID 19440)
-- Name: resident residentfacility1_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.resident
    ADD CONSTRAINT resident_pkey PRIMARY KEY (pid);


-- Completed on 2023-04-24 22:26:43 PDT

--
-- PostgreSQL database dump complete
--

