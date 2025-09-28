// app.get('/user', (req, res) => {
//     // Directly trusting query parameters can lead to NoSQL injection
//     db.collection('users').findOne({ username: req.query.username }, (err, user) => {
//         if (err) throw err;
//         res.json(user);
//     });
// });

//corected code
app.get('/user', (req, res) => {
    const raw = req.query.username;

    //add validation
    const ok = typeof raw === 'string' && /^[a-zA-Z0-9]{3,30}$/.test(raw);
    if (!ok) return res.status(400).json({error: 'Invalid Username'});

    //use validated input
    const username = raw;
    db.collection('users').findOne({ username: username}, (err, user) => {
        if (err) throw err;
        res.json(user);
       })
    })