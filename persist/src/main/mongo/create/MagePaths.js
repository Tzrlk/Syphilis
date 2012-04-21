var magePaths = [
    {
        id: 1,
        name: 'Acanthus',
        primary1: db.mageArcana.find({name: 'Fate'}),
        primary2: db.mageArcana.find({name: 'Time'}),
        inferior: db.mageArcana.find({name: 'Space'})
    },
    {
        id: 1,
        name: 'Mastigos',
        primary1: db.mageArcana.find({name: 'Mind'}),
        primary2: db.mageArcana.find({name: 'Space'}),
        inferior: db.mageArcana.find({name: 'Matter'})
    },
    {
        id: 1,
        name: 'Moros',
        primary1: db.mageArcana.find({name: 'Death'}),
        primary2: db.mageArcana.find({name: 'Matter'}),
        inferior: db.mageArcana.find({name: 'Spirit'})
    },
    {
        id: 1,
        name: 'Obrimos',
        primary1: db.mageArcana.find({name: 'Forces'}),
        primary2: db.mageArcana.find({name: 'Prime'}),
        inferior: db.mageArcana.find({name: 'Death'})
    },
    {
        id: 1,
        name: 'Thyrsus',
        primary1: db.mageArcana.find({name: 'Life'}),
        primary2: db.mageArcana.find({name: 'Spirit'}),
        inferior: db.mageArcana.find({name: 'Time'})
    }
];

db.createCollection('magePaths', {capped:true, size:5});
for (path in magePaths) db.magePaths.insert(path);