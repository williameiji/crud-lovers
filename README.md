# crud-lovers

Exercise for starting a rest API with java, implementing data persistence and CRUD.

## Routes

```yml
POST /api/cars
    - Route to add a car.
    - headers: {}
    - body: {
		modelo: "Fiat Argo 1.3",
		fabricante: "Fiat",
		dataFabricacao: "2023-01-10",
		valor: 10.000,
		anoModelo: 2023,
            }
```

```yml
GET /api/cars
    - Route to return a list car.
    - headers: {}
    - body: {}
```

```yml
PUT /api/cars/id
    - Route to update a car.
    - headers: {}
    - body: {
    		modelo: "Fiat Argo 1.0",
		fabricante: "Fiat",
		dataFabricacao: "2023-01-10",
		valor: 10.500,
		anoModelo: 2023,
            }
```

```yml
DELETE /api/cars/id
    - Route to delete a car.
    - headers: {}
    - body: {}
```
