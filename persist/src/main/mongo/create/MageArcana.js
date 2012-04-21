var mageArcana = [
    {
        id: 1,
        name: 'Death'
    },
    {
        id: 2,
        name: 'Fate'
    },
    {
        id: 3,
        name: 'Forces'
    },
    {
        id: 4,
        name: 'Life'
    },
    {
        id: 5,
        name: 'Matter'
    },
    {
        id: 6,
        name: 'Mind'
    },
    {
        id: 7,
        name: 'Prime'
    },
    {
        id: 8,
        name: 'Space'
    },
    {
        id: 9,
        name: 'Spirit'
    },
    {
        id: 10,
        name: 'Time'
    }
];

db.createCollection('mageArcana', {capped:true, size:10});
for (arcana in mageArcana) db.mageArcana.insert(arcana);