db.createUser(
  {
    user: "invest",
    pwd: "1nv35t",
    roles: [
       { role: "readWrite", db: "investimento" },
       { role: "readWrite", db: "accounts" }
    ]
  }
)
