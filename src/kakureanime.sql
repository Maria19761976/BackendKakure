-- ============================================================
-- KakureAnime - Script de base de datos
-- ============================================================

CREATE DATABASE IF NOT EXISTS kakureanime
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

USE kakureanime;

CREATE TABLE IF NOT EXISTS movies (
    id       INT AUTO_INCREMENT PRIMARY KEY,
    title    VARCHAR(255)   NOT NULL,
    year     INT            NOT NULL,
    duration INT            NOT NULL,
    genre    VARCHAR(100)   NOT NULL,
    studio   VARCHAR(100)   NOT NULL,
    rating   DECIMAL(3,1)   NOT NULL,
    poster   VARCHAR(500)   NOT NULL,
    synopsis TEXT           NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ============================================================
-- Datos iniciales (40 películas)
-- ============================================================

INSERT INTO movies (title, year, duration, genre, studio, rating, poster, synopsis) VALUES
('Spirited Away', 2001, 125, 'Fantasia', 'Studio Ghibli', 8.6,
 'https://cdn.myanimelist.net/images/anime/6/79597.jpg',
 'Chihiro queda atrapada en un mundo de espíritus y debe encontrar la manera de salvar a sus padres y regresar a casa.'),

('Princess Mononoke', 1997, 134, 'Aventura', 'Studio Ghibli', 8.7,
 'https://cdn.myanimelist.net/images/anime/7/75919.jpg',
 'Un príncipe maldito se ve envuelto en el conflicto entre la naturaleza y la expansión industrial, en una guerra sin buenos ni malos.'),

('Howl\'s Moving Castle', 2004, 119, 'Romance', 'Studio Ghibli', 8.6,
 'https://cdn.myanimelist.net/images/anime/5/75810.jpg',
 'Sophie, convertida en anciana por una maldición, encuentra refugio en el castillo ambulante del mago Howl mientras estalla una guerra.'),

('My Neighbor Totoro', 1988, 86, 'Comedia', 'Studio Ghibli', 8.3,
 'https://cdn.myanimelist.net/images/anime/4/75923.jpg',
 'Dos hermanas se mudan al campo y descubren criaturas mágicas que habitan el bosque cercano, incluyendo al entrañable Totoro.'),

('Kiki\'s Delivery Service', 1989, 103, 'Aventura', 'Studio Ghibli', 8.1,
 'https://cdn.myanimelist.net/images/anime/1579/140483.jpg',
 'Kiki, una joven bruja, inicia su vida independiente ofreciendo un servicio de reparto mientras busca confianza y propósito.'),

('Ponyo', 2008, 101, 'Fantasia', 'Studio Ghibli', 7.9,
 'https://cdn.myanimelist.net/images/anime/1331/138727.jpg',
 'Una niña pez desea convertirse en humana tras conocer a un niño, provocando un desequilibrio mágico en el mar y la costa.'),

('Nausicaä of the Valley of the Wind', 1984, 117, 'Ciencia ficcion', 'Topcraft', 8.3,
 'https://cdn.myanimelist.net/images/anime/10/75914.jpg',
 'En un mundo postapocalíptico, Nausicaä intenta comprender un ecosistema tóxico mientras evita una guerra devastadora.'),

('Castle in the Sky', 1986, 124, 'Aventura', 'Studio Ghibli', 8.2,
 'https://cdn.myanimelist.net/images/anime/5/37799.jpg',
 'Sheeta y Pazu huyen de piratas y militares mientras buscan Laputa, una legendaria ciudad flotante.'),

('Porco Rosso', 1992, 94, 'Accion', 'Studio Ghibli', 7.9,
 'https://cdn.myanimelist.net/images/anime/1728/138709.jpg',
 'Un piloto convertido en cerdo combate piratas aéreos en el Adriático mientras lidia con su pasado y un extraño hechizo.'),

('The Wind Rises', 2013, 126, 'Drama', 'Studio Ghibli', 8.1,
 'https://cdn.myanimelist.net/images/anime/8/52353.jpg',
 'La vida del ingeniero Jiro Horikoshi se cruza con su sueño de diseñar aviones y los dilemas morales de una época convulsa.'),

('Your Name', 2016, 106, 'Drama', 'CoMix Wave Films', 8.8,
 'https://cdn.myanimelist.net/images/anime/5/87048.jpg',
 'Dos adolescentes conectan misteriosamente intercambiando cuerpos, y descubren que su vínculo desafía el tiempo.'),

('Weathering With You', 2019, 112, 'Romance', 'CoMix Wave Films', 8.3,
 'https://cdn.myanimelist.net/images/anime/1880/101146.jpg',
 'En una Tokio lluviosa, un chico conoce a una chica con la capacidad de despejar el cielo, a un precio inesperado.'),

('Suzume', 2022, 122, 'Aventura', 'CoMix Wave Films', 8.2,
 'https://cdn.myanimelist.net/images/anime/1598/128450.jpg',
 'Suzume se ve envuelta en un viaje para cerrar puertas que desatan desastres, enfrentándose a pérdidas y recuerdos.'),

('A Silent Voice', 2016, 130, 'Drama', 'Kyoto Animation', 8.9,
 'https://cdn.myanimelist.net/images/anime/1122/96435.jpg',
 'Un joven busca redención tras haber acosado a una compañera sorda, intentando reparar el daño y reconciliarse consigo mismo.'),

('Violet Evergarden: The Movie', 2020, 140, 'Drama', 'Kyoto Animation', 8.7,
 'https://cdn.myanimelist.net/images/anime/1825/110716.jpg',
 'Violet continúa su camino para entender las emociones mientras una última carta puede cambiarlo todo.'),

('Perfect Blue', 1998, 81, 'Thriller', 'Madhouse', 8.5,
 'https://cdn.myanimelist.net/images/anime/1254/134212.jpg',
 'Una idol que se reinventa como actriz empieza a perder la línea entre realidad y ficción mientras sufre acoso y paranoia.'),

('Paprika', 2006, 90, 'Ciencia ficcion', 'Madhouse', 8.0,
 'https://cdn.myanimelist.net/images/anime/1929/93629.jpg',
 'Una tecnología permite entrar en sueños, pero al ser robada desata un caos donde el sueño invade el mundo real.'),

('Tokyo Godfathers', 2003, 92, 'Drama', 'Madhouse', 8.3,
 'https://cdn.myanimelist.net/images/anime/1480/132791.jpg',
 'Tres personas sin hogar encuentran un bebé en Nochebuena y emprenden una búsqueda llena de coincidencias y humanidad.'),

('The Girl Who Leapt Through Time', 2006, 98, 'Romance', 'Madhouse', 8.1,
 'https://cdn.myanimelist.net/images/anime/1/2432.jpg',
 'Una estudiante descubre que puede saltar en el tiempo y usa su poder para arreglar su vida, sin prever las consecuencias.'),

('Summer Wars', 2009, 114, 'Ciencia ficcion', 'Madhouse', 8.0,
 'https://cdn.myanimelist.net/images/anime/1593/116751.jpg',
 'Un error en un mundo virtual amenaza sistemas globales, y una familia debe unirse para evitar el colapso.'),

('Wolf Children', 2012, 117, 'Drama', 'Studio Chizu', 8.7,
 'https://cdn.myanimelist.net/images/anime/9/35721.jpg',
 'Una madre cría sola a sus hijos mitad lobo, mitad humanos, enfrentando sacrificios y decisiones sobre identidad.'),

('Mirai', 2018, 98, 'Fantasia', 'Studio Chizu', 7.4,
 'https://cdn.myanimelist.net/images/anime/1042/95674.jpg',
 'Un niño celoso de su hermana bebé vive encuentros fantásticos con familiares de distintas épocas.'),

('Evangelion: 1.0 You Are (Not) Alone', 2007, 98, 'Ciencia ficcion', 'Khara', 7.7,
 'https://cdn.myanimelist.net/images/anime/7/74975.jpg',
 'Shinji es reclutado para pilotar un EVA y proteger a la humanidad de los Ángeles, mientras carga con traumas personales.'),

('Evangelion: 2.0 You Can (Not) Advance', 2009, 112, 'Ciencia ficcion', 'Khara', 8.1,
 'https://cdn.myanimelist.net/images/anime/5/74983.jpg',
 'Nuevos pilotos y amenazas intensifican la guerra contra los Ángeles, y el vínculo entre los personajes se vuelve más frágil.'),

('Evangelion: 3.0 You Can (Not) Redo', 2012, 96, 'Ciencia ficcion', 'Khara', 7.3,
 'https://cdn.myanimelist.net/images/anime/9/43201.jpg',
 'Tras despertar en un mundo cambiado, Shinji intenta arreglarlo todo, pero cada decisión lo hunde más en el conflicto.'),

('Ghost in the Shell', 1995, 83, 'Ciencia ficcion', 'Production I.G', 8.3,
 'https://cdn.myanimelist.net/images/anime/10/82594.jpg',
 'En un futuro ciberpunk, Motoko Kusanagi persigue a un hacker mientras cuestiona qué significa ser humano en un cuerpo artificial.'),

('Akira', 1988, 124, 'Ciencia ficcion', 'Tokyo Movie Shinsha', 8.1,
 'https://cdn.myanimelist.net/images/anime/1408/114012.jpg',
 'En Neo-Tokyo, un experimento desata poderes destructivos y una crisis política y social de escala apocalíptica.'),

('One Piece Film: Z', 2012, 107, 'Accion', 'Toei Animation', 7.9,
 'https://cdn.myanimelist.net/images/anime/6/44297.jpg',
 'Los Sombrero de Paja se enfrentan a un antiguo almirante con un plan que amenaza el equilibrio del mundo.'),

('Demon Slayer: Mugen Train', 2020, 117, 'Accion', 'ufotable', 8.6,
 'https://cdn.myanimelist.net/images/anime/1704/106947.jpg',
 'Tanjiro y compañía se unen al Pilar de la Llama para investigar desapariciones en un tren dominado por pesadillas.'),

('Jujutsu Kaisen 0', 2021, 105, 'Accion', 'MAPPA', 8.3,
 'https://cdn.myanimelist.net/images/anime/1121/119044.jpg',
 'Yuta, marcado por una maldición, entra en el instituto de hechicería para aprender a controlar su poder y proteger a los suyos.'),

('Dragon Ball Super: Broly', 2018, 100, 'Accion', 'Toei Animation', 8.0,
 'https://cdn.myanimelist.net/images/anime/1575/93498.jpg',
 'Goku y Vegeta se enfrentan a Broly, un Saiyan con un potencial monstruoso, mientras resurgen viejos conflictos.'),

('Redline', 2009, 102, 'Accion', 'Madhouse', 8.1,
 'https://cdn.myanimelist.net/images/anime/12/28553.jpg',
 'Una carrera intergaláctica ilegal desata adrenalina y caos absoluto en un espectáculo de velocidad sin frenos.'),

('Promare', 2019, 111, 'Accion', 'Trigger', 7.9,
 'https://cdn.myanimelist.net/images/anime/1008/101845.jpg',
 'Un equipo de bomberos combate un fenómeno humano ígneo mientras descubre una conspiración que pone en jaque a la ciudad.'),

('My Hero Academia: Heroes Rising', 2019, 104, 'Accion', 'Bones', 7.9,
 'https://cdn.myanimelist.net/images/anime/1019/103292.jpg',
 'La Clase 1-A se enfrenta a un villano abrumador en una isla remota, obligando a los héroes en formación a ir más allá de sus límites.'),

('Gintama: The Final', 2021, 104, 'Comedia', 'Bandai Namco Pictures', 8.7,
 'https://cdn.myanimelist.net/images/anime/1245/116760.jpg',
 'Gintoki y sus aliados encaran el último enfrentamiento mientras el pasado y el futuro de Edo se deciden en una batalla final.'),

('Fate/stay night: Heaven\'s Feel I. Presage Flower', 2017, 120, 'Fantasia', 'ufotable', 8.2,
 'https://cdn.myanimelist.net/images/anime/1274/102213.jpg',
 'La Guerra del Santo Grial toma un giro oscuro cuando secretos y sacrificios amenazan con destruir a quienes participan.'),

('Fate/stay night: Heaven\'s Feel II. Lost Butterfly', 2019, 117, 'Fantasia', 'ufotable', 8.6,
 'https://cdn.myanimelist.net/images/anime/1974/98158.jpg',
 'La guerra se vuelve más brutal; alianzas se rompen y la sombra que devora la ciudad exige decisiones imposibles.'),

('Fate/stay night: Heaven\'s Feel III. Spring Song', 2020, 122, 'Fantasia', 'ufotable', 8.7,
 'https://cdn.myanimelist.net/images/anime/1142/112957.jpg',
 'En el clímax de la Guerra del Grial, Shirou debe elegir qué salvar cuando todo lo que ama queda al borde del abismo.'),

('Grave of the Fireflies', 1988, 89, 'Drama', 'Studio Ghibli', 8.5,
 'https://cdn.myanimelist.net/images/anime/1485/141208.jpg',
 'Durante los últimos meses de la Segunda Guerra Mundial, dos hermanos huérfanos luchan por sobrevivir en un Japón devastado por los bombardeos.'),

('Millennium Actress', 2001, 87, 'Drama', 'Madhouse', 8.2,
 'https://cdn.myanimelist.net/images/anime/1648/93626.jpg',
 'Un documentalista entrevista a una legendaria actriz retirada, reviviendo su vida a través de recuerdos que se mezclan con los papeles que interpretó en el cine.'),

('The Tale of the Princess Kaguya', 2013, 137, 'Fantasia', 'Studio Ghibli', 8.1,
 'https://cdn.myanimelist.net/images/anime/1935/93606.jpg',
 'Basada en un cuento popular japonés, narra la historia de una misteriosa niña encontrada dentro de un bambú que crece rápidamente y cautiva a todos con su belleza.'),

('Josee, the Tiger and the Fish', 2020, 98, 'Romance', 'Bones', 8.0,
 'https://cdn.myanimelist.net/images/anime/1714/108892.jpg',
 'Una joven con discapacidad y un estudiante universitario desarrollan una relación profunda que les obliga a enfrentarse a sus miedos, sueños y al futuro.');
