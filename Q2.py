from flask_login import current_user, login_required
from flask import abort, jsonify

# @app.route('/account/<user_id>')
# def get_account(user_id):
#     user = db.query(User).filter_by(id=user_id).first()
#     return jsonify(user.to_dict())


#corrected code
@app.route('/account/<user_id>')
#require login
@login_required
def get_account(user_id):
    #check for access
    if str(current_user.id) != str(user_id) and not current_user.is_admin:
        abort()
    user = db.query(User).filter_by(id=user_id).first()
    return jsonify(user.to_dict())