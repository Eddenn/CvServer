<html>
<head>
	<%@ page contentType="text/html; charset=UTF-8" %>
	<title>Projet XML - HAZARD Alexandre - ETIENNE Tom</title>
	<link rel="stylesheet" href="/resources/style.css">
</head>

<body>
	<img class="no-bottom-margin" src="/resources/logo_rouen.png" style="width: auto; height: 150px;" alt="Logo de l'Université de Rouen"/>
	<h1 class="no-bottom-margin">Projet XML - Master G.I.L.</h1>
	<h3 class="no-bottom-margin">HAZARD Alexandre<br/>
		ETIENNE Tom</h3>
	<h3 class="no-bottom-margin">Date de derniere mise a jour : 17 avril 2018</h3>

	<div>
		<h2>Liste des commandes :</h2>
		<div class="content">
			<table>
				<thead>
					<tr>
						<th>URL</th>
						<th>Methode</th>
						<th>Action</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td>/cvi</td>
						<td>GET</td>
						<td>Retourne la page d accueil avec un message identifiant le
							projet</td>
					</tr>

					<tr>
						<td>/cvi/help</td>
						<td>GET</td>
						<td>la liste des commandes disponibles</td>
					</tr>

					<tr>
						<td>/cvi/resume</td>
						<td>GET</td>
						<td>Retourne un flux XML contenant la liste des CV résumés
							aux informations suivantes : id, nom, prénom et objectif. Chaque
							CV comporte un identifiant {id} numérique unique</td>
					</tr>

					<tr>
						<td>/cvi/resume/id</td>
						<td>GET</td>
						<td>Retourne un flux XML décrivant le détail du CV
							d’identifiant {Id}</td>
					</tr>

					<tr>
						<td>/cvi/insert</td>
						<td>POST</td>
						<td>Reçoit un flux XML décrivant un CV, crée l'objet
							correspondant et retourne la valeur de l’identifiant {Id} créé.</td>
					</tr>

					<tr>
						<td>/cvi/delete/id</td>
						<td>DELETE</td>
						<td>Supprime le cv dont l’identifiant est {Id}</td>
					</tr>

					<tr>
						<td>/cvi/update/id</td>
						<td>PUT</td>
						<td>Met à jour le cv dont l’identifiant est {Id}</td>
					</tr>

				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
