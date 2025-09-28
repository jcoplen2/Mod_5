from flask import request, abort
from flask_login import login_required, current_user
from werkzeug.security import generate_password_hash

# @app.route('/reset-password', methods=['POST'])
# def reset_password():
#     email = request.form['email']
#     new_password = request.form['new_password']
#     user = User.query.filter_by(email=email).first()
#     user.password = new_password
#     db.session.commit()
#     return 'Password reset'

# corrected code
@app.route('/reset-password', methods=['POST'])
#require login
@login_required
def reset_password():
    new_password = request.form['new_password']
    #validate user can only change their password
    user = User.query.get(current_user.id)
    if not user:
        abort(404)
    #hash password for storing
    user.password_hash = generate_password_hash(new_password)
    db.session.commit()
    return 'Password Reset'