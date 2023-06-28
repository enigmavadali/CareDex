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
-- Name: Facility1; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "Facility1" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'en_US.UTF-8';


ALTER DATABASE "Facility1" OWNER TO postgres;

\connect "Facility1"

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

INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (1, 'Georgia', 'Banner', NULL, 'Female', 70, '1952-02-20', '912-313-0194', 'NO', 125, 'https://robohash.org/commodinemoaut.png?size=200x200&set=set1', 'Zara Banner', '912-679-6865', 'grand-son', 'Jessica Banner', '754-943-4842', 'daughter', 'YES', 'YES', 'Hypertension, Hip Replacement - 3 years ago', 'YES', '2021-01-04', '2021-04-05', 'YES', 'NO', 'NO', 'NO', 'Fredrika Turvie', '973-224-5897', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (2, 'Laura', 'Axford', NULL, 'Female', 80, '1942-07-27', '928-544-5183', 'NO', 134, 'https://robohash.org/laudantiumlaboreeos.png?size=200x200&set=set1', 'Francis Ali', '612-475-5498', 'son-in-law', 'Margaret Benediktsson', '947-661-5123', 'daughter', 'YES', 'YES', 'Diabetic, COPD', 'YES	', NULL, '2021-03-27', 'NO', 'YES', 'NO', 'NO', 'Dr. Carol Abys', '702-420-7977', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (3, 'Ronda', 'Harburtson', NULL, 'Female', 60, '1929-08-27', '909-681-3069', 'NO', 122, 'https://robohash.org/nemoreprehenderiteveniet.png?size=200x200&set=set1', 'Jewel Schutt', '909-343-6245', 'son', 'Steven Holloway', '602-945-5955', 'son', 'YES', 'YES', 'Eyeglasses - Depression - Hypertension', 'YES', NULL, '2021-01-06', 'NO', 'NO', 'NO', 'NO', 'Dr. Madelyn Mudle', '518-557-0500', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (4, 'Christopher', 'Keightley', NULL, 'Male', 79, '1943-10-24', '704-608-7363', 'NO', 229, 'https://robohash.org/quinisiea.png?size=200x200&set=set1', 'Salvador Kidd', '800-987-3788', 'daughter', 'Caroline Cook', '776-956-9939', 'daughter-in-law', 'YES', 'YES', 'Aphasia induced by Prior Stroke, Congestive Heart Failure', 'YES', NULL, '2021-02-24', 'YES', 'YES', 'NO', 'NO', 'Dr. Nikki Glashby', '978-228-3974', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (5, 'Warren', 'McMeanma', NULL, 'Male', 83, '1939-05-21', '163-257-1533', 'NO', 163, 'https://robohash.org/eosquamtenetur.png?size=200x200&set=set1', 'Paul Ramsey', '373-837-9391', 'son', 'Susan Hodgson', '130-803-8199', 'son', 'YES', 'YES', 'Asthmatic - Colon Cancer ', 'YES', '2021-02-17', '2021-02-19', 'YES', 'YES', 'NO', 'NO', 'Dr. Harry Klus', '248-222-4556', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (7, 'Ruby', 'Santori', NULL, 'Female', 69, '1953-03-19', '525-264-7395', 'NO', 102, 'https://robohash.org/nihilnamquis.png?size=200x200&set=set1', 'Raul Parker', '669-402-6827', 'daughter', 'John Wiggins', '783-699-6603', 'grand-daughter', 'YES', 'YES', 'Hearing Aids, MS (early stage), Previous breast cancer', 'YES', '2021-10-03', '2021-09-04', 'YES', 'NO', 'NO', 'NO', 'Yoseline White', '607-544-9081', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (8, 'Lily', 'Kitchinham', NULL, 'Female', 85, '1937-03-19', '624-324-7238', 'NO', 116, 'https://robohash.org/velautvoluptas.png?size=200x200&set=set1', 'Zara Collins', '724-174-3646', 'daughter', 'Matthew Jones', '289-343-4508', 'son-in-law', 'YES', 'YES', 'Diabetic, ESRD', 'YES', '2021-07-19', '2021-12-28', 'NO', 'NO', 'NO', 'NO', 'Dr. Patricia Fishbourne', '773-532-8380', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (9, 'Hadley', 'Frid', NULL, 'Female', 83, '1939-01-18', '334-988-5496', 'NO', 165, 'https://robohash.org/nisiporroconsequuntur.png?size=200x200&set=set1', 'Mariyah Solomon', '539-601-2273', 'son', 'Edward Lee', '119-153-7846', 'son', 'YES', 'YES', 'Hearing Aids,  Hypertension, Chronic back pain', 'YES', '2021-03-15', '2021-03-19', 'YES', 'YES', 'NO', 'NO', 'Dr. Lockwood MacColl', '702-721-2225', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (10, 'Marita', 'Deniseau', NULL, 'Female', 101, '1921-04-05', '156-781-7523', 'NO', 114, 'https://robohash.org/quinihiliste.png?size=200x200&set=set1', 'Ali Cummings', '524-623-4137', 'son', 'Ken Bradley', '829-174-4897', 'daughter', 'YES', 'YES', 'Osteoarthritis, Congestive Heart Failure', 'YES', NULL, '2021-09-03', 'YES', 'YES', 'NO', 'NO', 'Dr. Harley Orneblow', '872-209-3368', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (12, 'Melissa', 'Gosse', NULL, 'Female', 91, '1931-07-31', '291-999-8275', 'NO', 108, 'https://robohash.org/laborumutquia.png?size=200x200&set=set1', 'Ivy Oneill', '417-846-3377', 'son-in-law', 'Margaret Wilson', '542-720-2077', 'son-in-law', 'YES', 'YES', 'COPD, Arthritis, MCI', 'YES', '2021-09-25', '2021-11-16', 'YES', 'NO', 'NO', 'NO', 'Dr. Solomon Piccard', '205-575-1704', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (14, 'Silvia', 'Brandli', NULL, 'Female', 84, '1938-07-27', '672-938-4346', 'NO', 144, 'https://robohash.org/exestneque.png?size=200x200&set=set1', 'London Lambert', '160-570-8260', 'daughter-in-law', 'Margaret Rivera', '705-387-9681', 'grand-daughter', 'YES', 'YES', 'COPD (oxygen), Peanut Allergy, Hypertension', 'YES', '2021-07-12', NULL, 'NO', 'YES', 'NO', 'NO', 'Dr. Teddy Spilling', '212-877-2536', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (16, 'Zeja', 'Vasilik', NULL, 'Female', 85, '1937-09-19', '195-140-4952', 'NO', 127, 'https://robohash.org/nihilcupiditateid.png?size=200x200&set=set1', 'Reed Garrett', '874-682-4688', 'grand-son', 'Carol Padilla', '810-591-8516', 'son', 'YES', 'YES', 'Hearing Aids, Hypertension, Osteoarthritis', 'YES', '2022-01-19', NULL, 'YES', 'YES', 'NO', 'NO', 'Dr. Matthew Bricham', '541-702-6636', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (18, 'Gennifer', 'Antoniou', NULL, 'Female', 81, '1941-06-22', '140-485-5806', 'NO', 110, 'https://robohash.org/voluptatumillumnobis.png?size=200x200&set=set1', 'Zara Collins', '692-632-8229', 'grand-daughter', 'Carol Padilla', '329-478-3529', 'daughter-in-law', 'YES', 'YES', 'Rheumatoid Arthritis, Depression', 'YES', '2021-05-06', '2021-06-17', 'NO', 'YES', 'NO', 'NO', 'Dr. Christina Bricham', '612-217-4097', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (19, 'Tracey', 'Tuhy', NULL, 'Female', 74, '1948-03-31', '424-886-5656', 'NO', 125, 'https://robohash.org/etrerumaccusantium.png?size=200x200&set=set1', 'Oliver Michael', '135-611-2815', 'daughter-in-law', 'Kenny Johnson', '555-670-3899', 'daughter', 'YES', 'YES', 'Uses Hearing Aids and eyeglasses, Knee Replacement (5 weeks ago)', 'YES', NULL, NULL, 'YES', 'YES', 'NO', 'NO', 'Dr. Rita monrroe', '714-905-8167', NULL);
INSERT INTO public.resident (pid, first_name, last_name, room, gender, age, dob, telephone, haspet, weight_lbs, photo, emmergencycontact1, telephone_emc1, relationship_emc1, emmergencycontact2, telephone_emc2, relationship_emc2, isambulatory, isabletocommunicate, medicalinformation, isvacinnatedforcovid19, lastfall, lastervisit, dischargedfromovernighthospitalstay, isfallrisk, iswanderrisk, iselopementrisk, physician, physician_telephone, ispet) VALUES (20, 'Germaine', 'Ramusson', NULL, 'Female', 83, '1939-09-12', '270-418-7427', 'NO', 140, 'https://robohash.org/doloresmaioresest.png?size=200x200&set=set1', 'Adrian Stanley', '670-835-8016', 'grand-daughter', 'Carol Padilla', '272-158-5676', 'son-in-law', 'YES', 'YES', 'Prior Stroke,  hypertension, MCI', 'YES', NULL, '2021-11-11', 'NO', 'NO', 'NO', 'NO', 'Dr. Casey Huges', '979-667-8922', NULL);

SELECT * FROM public.resident;
--
-- TOC entry 3431 (class 2606 OID 19440)
-- Name: resident residentfacility1_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.resident
    ADD CONSTRAINT residentfacility1_pkey PRIMARY KEY (pid);


-- Completed on 2023-04-24 22:26:43 PDT

--
-- PostgreSQL database dump complete
--

