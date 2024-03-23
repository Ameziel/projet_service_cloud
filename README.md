=Objectif du travail

TP - Fin de module développement et service cloud
Par groupe réaliser le besoin suivant :
- Développer et conteneuriser une API qui permet de récupérer et stocker des
données en BDD
- L’API doit répondre aux besoin suivant :
• Expose une route dans laquelle l’utilisateur pousse un json
- Ce json est interprété et stocké
- Cette route doit appeler l’api développé par un autre groupe pour récupérer
la dernière donnée stockée pour également la stocker en bdd
• L’utilisateur doit pouvoir récupérer les données :
- Par ID
- Toutes les données avec un système de pagination
- L’API doit être déployée dans un cluster Kubernetes
• Exposée derrière un Ingress
• Scalable
- Un système de stockage de données doit être déployé (SQL ou NO SQL ou autre)
dans le cluster Kubernetes
- Un outil de monitoring des coûts doit être déployé dans le cluster (si possible)
- Un outil de monitoring de sécurité doit être déployé dans le cluster
- Vous devez vous mettre d’accord avec votre groupe binôme sur vos contrats
d’API ainsi que sur les données à vous échanger
Rendu le 27 MARS à 12h00 :
- Repo GIT
- Rapport PDF par groupe
1
