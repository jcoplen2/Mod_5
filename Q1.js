//question one

// app.get('/profile/:userId', (req, res) => {
//     User.findById(req.params.userId, (err, user) => {
//         if (err) return res.status(500).send(err);
//         res.json(user);
//     });
// });

//corrected code
app.get('/profile/:userId', (req, res) => { 
    //define userId
    const {userId} = req.params;
    //require login
    if (!req.user) {
        return res.status(401).json({ error: "not authorized"});
    }
        //auth check
    if (req.user.id !== userId && req.user.role !== 'admin'){
        return res.status(403).json({ error: 'Forbidden'})
    }
    User.findById(req.params.userId, (err, user) => {
            if (err) return res.status(500).send(err); 
            res.json(user); 
        }); 
    });
